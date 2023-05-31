package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(Long userId);

    Optional<User> findByCompanyIdAndNumber(Long companyId, String number);
}