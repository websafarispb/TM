package com.bookshop.mapper;

import com.bookshop.dto.UserDto;
import com.bookshop.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        return new UserDto(
            user.getId(),
            user.getName(),
            user.getAddress(),
            user.getEmail(),
            user.getPhone(),
            user.getLogin(),
            user.getPassword(),
            user.getRole()
        );
    }

    public User toEntity(UserDto dto) {
        return new User(
            dto.getId(),
            dto.getName(),
            dto.getAddress(),
            dto.getEmail(),
            dto.getPhone(),
            dto.getLogin(),
            dto.getPassword(),
            dto.getRole()
        );
    }
}



