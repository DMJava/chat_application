package ua.goit.offine.controller;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.app.dao.GroupsDao;
import ua.com.app.dao.MessageDao;
import ua.com.app.dao.UsersDao;

/**
 * Spring test configuration.
 *
 * @author Andrey M
 */
@Configuration
public class TestConfiguration {

  @Bean
  public MessageDao messageDao() {
    return Mockito.mock(MessageDao.class);
  }

  @Bean
  public UsersDao usersDao() {
    return Mockito.mock(UsersDao.class);
  }

  @Bean
  public GroupsDao groupsDao() {
    return Mockito.mock(GroupsDao.class);
  }
}
