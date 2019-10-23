package realTime.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import realTime.constants.Constants;
import realTime.model.Command;

@Controller
public class Client {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @MessageMapping("/topic")
    @SendTo("/topic")
    public void receive(Command command) throws Exception {
        kafkaTemplate.send(Constants.KAFKA_LISTENER_TOPIC, objectMapper.writeValueAsString(command));
    }
}
