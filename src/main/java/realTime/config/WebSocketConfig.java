package realTime.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

import static realTime.constants.Constants.KAFKA_LISTENER_TOPIC;
import static realTime.constants.Constants.WEB_SOCKET_CONNECT_ENDPOINT;
import static realTime.constants.Constants.WEB_SOCKET_SIMPLE_BROKER;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        stompEndpointRegistry.addEndpoint(WEB_SOCKET_CONNECT_ENDPOINT).withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker(WEB_SOCKET_SIMPLE_BROKER);
    }
}
