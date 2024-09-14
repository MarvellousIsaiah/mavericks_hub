package com.maverickstube.maverickshub.Security.config.services;


import com.maverickstube.maverickshub.Security.config.models.SecureUser;
import com.maverickstube.maverickshub.models.User;
import com.maverickstube.maverickshub.services.MavericksHubUserService;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final MavericksHubUserService userServices;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
            User user = userServices.getUserByUsername(username);
            return new SecureUser(user);
        }catch (RuntimeException runtimeException){
            throw new UsernameNotFoundException(runtimeException.getMessage());
        }
    }
}
