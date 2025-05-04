package com.truco.truco_user_service.service.impl;

import com.truco.truco_user_service.dto.UserAccountDto;
import com.truco.truco_user_service.repository.UserAccountRepository;
import com.truco.truco_user_service.service.UserAccountService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository userAccountRepository;

    public UserAccountServiceImpl(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public Optional<UserAccountDto> getUserAccountById(String id) {
        return userAccountRepository.findById(id)
                .map(UserAccountDto::toDTO);
    }

}
