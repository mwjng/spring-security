package hello.security.config;

import hello.security.service.InMemoryUserDetailService;
import hello.security.service.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/*
@Configuration
public class ProjectConfigV1 {

    @Bean
    public UserDetailsService userDetailsService() {
        User u = new User("john", "12345", "read");
        List<User> users = List.of(u);
        return new InMemoryUserDetailService(users);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
*/
