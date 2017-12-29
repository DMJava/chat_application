package ua.com.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import ua.com.app.controller.ChatMessageController;

/**
 * Configuration for web sockets.
 */
@Configuration
@EnableWebSocket
@ComponentScan("ua.com.app.controller")
public class WebSocketConfiguration
    implements WebSocketConfigurer {

  @Autowired
  private ChatMessageController messageController;

  @Override
  public void registerWebSocketHandlers(
      WebSocketHandlerRegistry registry) {
    registry.addHandler(messageController, "/chat");
  }
}
