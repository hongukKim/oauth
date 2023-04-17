package com.ukidugi.practice.oauth.service;

import com.ukidugi.practice.api.entity.user.User;
import com.ukidugi.practice.api.repository.user.UserRepository;
import com.ukidugi.practice.oauth.entity.RoleType;
import com.ukidugi.practice.oauth.entity.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByLoginId(username);
        if (user == null) {
            throw new UsernameNotFoundException("Can not find username.");
        }

        //return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
         //       Collections.singletonList(new SimpleGrantedAuthority(RoleType.USER.getCode())));

        return UserPrincipal.create(user);
    }
}
