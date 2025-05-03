package com.truco.truco_user_service.controller;

import com.truco.truco_user_service.dto.UserAccountDto;
import com.truco.truco_user_service.model.UserAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAccountController {

    private static final String PROFILE = "/profile";
    private static final String HISTORY = "/history";
    private static final String STATS = "/stats";

    @GetMapping
    @RequestMapping(PROFILE)
    public ResponseEntity<UserAccountDto> getUserProfile(String id){

    }

    @GetMapping
    @RequestMapping(HISTORY)
    public void getHistoryGames(String id){

    }

    @GetMapping
    @RequestMapping(STATS)
    public void getStatsGames(String id){

    }

}
