package com.ukidugi.practice.api.repository.user;

import com.ukidugi.practice.api.entity.user.UserRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken, Long> {
    UserRefreshToken findByLoginId(String userId);
    UserRefreshToken findByLoginIdAndRefreshToken(String userId, String refreshToken);
}
