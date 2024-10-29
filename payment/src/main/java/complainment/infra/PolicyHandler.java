package complainment.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import complainment.config.kafka.KafkaProcessor;
import complainment.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    FeeRepository feeRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='민원접수됨'"
    )
    public void whenever민원접수됨_결재신청(@Payload 민원접수됨 민원접수됨) {
        민원접수됨 event = 민원접수됨;
        System.out.println(
            "\n\n##### listener 결재신청 : " + 민원접수됨 + "\n\n"
        );

        // Sample Logic //
        Fee.결재신청(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
