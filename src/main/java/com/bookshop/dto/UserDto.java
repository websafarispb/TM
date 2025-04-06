package com.bookshop.dto;

import com.bookshop.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String login;
    private String password;
    private Role role;
}

