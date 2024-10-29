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
    연계Repository 연계Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='결재완료됨'"
    )
    public void whenever결재완료됨_연계등록(@Payload 결재완료됨 결재완료됨) {
        결재완료됨 event = 결재완료됨;
        System.out.println(
            "\n\n##### listener 연계등록 : " + 결재완료됨 + "\n\n"
        );

        // Sample Logic //
        연계.연계등록(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
