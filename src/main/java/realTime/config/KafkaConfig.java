package realTime.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import realTime.socketHandler.WebsocketService;

import static realTime.constants.Constants.KAFKA_LISTENER_TOPIC;

@Component
public class KafkaConfig {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @Autowired
    private WebsocketService websocketService;

    @KafkaListener(topics = KAFKA_LISTENER_TOPIC)
    public void consumer(String message) throws JsonProcessingException {
        logger.info("get topic from kafka: {}", message);

        websocketService.send(message);
    }
}
