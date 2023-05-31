package com.kachinga.asms.amcos.service;

import com.kachinga.asms.amcos.domain.User;
import com.kachinga.asms.amcos.domain.dto.UserDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Mono<UserDto> get(Long id);

    Mono<List<User>> getUsers();

    Optional<User> findById(Long userId);

    Optional<User> findByCompanyIdAndNumber(Long companyId, String number);

    User save(User user);

    String transactor(Long userId);
}
