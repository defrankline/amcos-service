package com.kachinga.asms.amcos.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoggedInUserDto {
    private Long id;
    private String name;
    private String login;
    private String token;
    private Long tokenExpire;
    private String email;
    private String number;
    private Long companyId;
    private String companyName;
    private String companyNumber;
    private List<String> roles;
}
