package com.loganz.tracnghiemonline;

import com.loganz.tracnghiemonline.entities.User;
import com.loganz.tracnghiemonline.repositories.UserRepository;
import com.loganz.tracnghiemonline.utils.EnumRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class TracnghiemonlineApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(com.loganz.tracnghiemonline.TracnghiemonlineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count()==0){
            User user = new User("LoganZ","loganz@hcmute.edu.vn","123456",
                    Arrays.asList(EnumRole.ROLE_ADMIN.name()));
            userRepository.save(user);
        }
    }
}