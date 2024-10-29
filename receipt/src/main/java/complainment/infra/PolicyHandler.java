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
    ComplainmentRepository complainmentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='결재실패'"
    )
    public void whenever결재실패_민원접수실패처리(@Payload 결재실패 결재실패) {
        결재실패 event = 결재실패;
        System.out.println(
            "\n\n##### listener 민원접수실패처리 : " + 결재실패 + "\n\n"
        );

        // Sample Logic //
        Complainment.민원접수실패처리(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
