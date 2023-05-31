package com.kachinga.asms.amcos.service.impl;

import com.kachinga.asms.amcos.domain.User;
import com.kachinga.asms.amcos.domain.dto.UserDto;
import com.kachinga.asms.amcos.repository.UserRepository;
import com.kachinga.asms.amcos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final WebClient.Builder webClientBuilder;

    private final UserRepository userRepository;

    @Override
    public Mono<UserDto> get(Long id) {
        return this.webClientBuilder.build().get()
                .uri(uriBuilder -> uriBuilder
                        .path("lb://auth-service/api/auth-service/users/currentUser/{id}")
                        .build(id))
                .retrieve()
                .bodyToMono(UserDto.class);
    }

    @Override
    public Mono<List<User>> getUsers() {
        return this.webClientBuilder.build()
                .get()
                .uri("lb://auth-service/api/auth-service/users/serviceSyncData")
                .retrieve()
                .bodyToFlux(User.class)
                .collectList();
    }

    @Override
    public Optional<User> findById(Long userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public Optional<User> findByCompanyIdAndNumber(Long companyId, String number) {
        return userRepository.findByCompanyIdAndNumber(companyId, number);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public String transactor(Long userId) {
        Optional<User> row = userRepository.findByUserId(userId);
        return row.map(User::getName).orElse(null);
    }
}
