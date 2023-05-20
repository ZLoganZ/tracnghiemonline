package com.loganz.tracnghiemonline.services.user;

import com.loganz.tracnghiemonline.dtos.user.UserDto;
import com.loganz.tracnghiemonline.entities.User;
import org.springframework.data.domain.Page;

import java.security.Principal;
import java.util.List;

public interface UserService {

    Page<User> filter(String search,
                      int page, int size, String sort, String column);

    List<User> getAllUsers(String search);

    User getUser(String id);

    User getUserByEmail(String email);

    User create(UserDto dto, Principal principal);

    User update(String id, UserDto dto, Principal principal);

    User changeStatus(String id, Principal principal);
}
