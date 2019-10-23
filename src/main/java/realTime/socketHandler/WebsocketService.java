package realTime.socketHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import realTime.constants.Constants;

@Service
public class WebsocketService {

    private static final Logger logger = LoggerFactory.getLogger(WebsocketService.class);

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void send(Object data) throws JsonProcessingException {
        messagingTemplate.convertAndSend(Constants.WEB_SOCKET_SUBSCRIBE_TOPIC, data);
        logger.info("convert and send: {}", objectMapper.writeValueAsString(data));
    }
}
