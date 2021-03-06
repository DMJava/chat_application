package ua.com.app.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Get information about user from repository.
 */
public class UserDetailedServiceImpl implements UserDetailsService {

  private final UserService userService;

  public UserDetailedServiceImpl(UserService userService) {
    this.userService = userService;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return Optional.ofNullable(userService.getById(username)).orElseThrow(
        () -> new UsernameNotFoundException("User '" + username + "' not exists!"));
  }
}
