package ua.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.com.app.service.MessagesService;

/**
 * Main chat page controller.
 */
@Controller
@RequestMapping("/")
public class ChatRoomController {
  private static final int TOP_N = 10;
  private final MessagesService messageDao;

  @Autowired
  public ChatRoomController(MessagesService messageDao) {
    this.messageDao = messageDao;
  }

  @GetMapping
  public ModelAndView chatPage() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("main");
    modelAndView.addObject("chat", "public");
    modelAndView.addObject("messages",
        messageDao.getLastN(TOP_N));
    return modelAndView;
  }
}
