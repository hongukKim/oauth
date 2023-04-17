package com.ukidugi.practice.api.service;

import com.ukidugi.practice.api.entity.user.User;
import com.ukidugi.practice.api.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String loginId) {
        return userRepository.findByLoginId(loginId);
    }
}
