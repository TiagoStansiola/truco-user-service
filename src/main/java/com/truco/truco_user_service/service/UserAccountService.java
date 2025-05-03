package com.truco.truco_user_service.service;

import com.truco.truco_user_service.dto.UserAccountDto;
import com.truco.truco_user_service.model.UserAccount;

import java.util.Optional;

public interface UserAccountService {

    Optional<UserAccountDto> getUserAccountById(String id);
}
