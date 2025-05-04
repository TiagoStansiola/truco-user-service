package com.truco.truco_user_service.controller;

import com.truco.truco_user_service.dto.UserAccountDto;
import com.truco.truco_user_service.service.UserAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserAccountController {

    private static final String PROFILE = "/profile";

    private final UserAccountService userAccountService;

    public UserAccountController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @GetMapping(path = PROFILE)
    public ResponseEntity<Optional<UserAccountDto>> getUserProfile(@RequestParam String id) {
        return ResponseEntity.ok(userAccountService.getUserAccountById(id));
    }
}
