package com.ukidugi.practice.vo;

import com.ukidugi.practice.api.entity.user.UserRefreshToken;
import com.ukidugi.practice.oauth.token.AuthToken;
import lombok.Getter;

@Getter
public class TokenVO {
    String accessToken;
    String refreshToken;

    public TokenVO(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public TokenVO(AuthToken accessToken, UserRefreshToken userRefreshToken) {
    }
}
