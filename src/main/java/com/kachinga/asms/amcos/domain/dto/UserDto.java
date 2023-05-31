package com.kachinga.asms.amcos.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDto {
    private Long id;
    private String name;
    private String login;
    private String token;
    private String email;
    private String number;
    private Long companyId;
    private String companyNumber;
}
