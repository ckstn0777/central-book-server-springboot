package com.ckstn0777.centralbook.repository;

import com.ckstn0777.centralbook.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // 이미 생성된 사용자인지 아닌지를 판단
}
