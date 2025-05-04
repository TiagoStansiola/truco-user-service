package com.truco.truco_user_service.controller;

import com.truco.truco_user_service.model.UserStats;
import com.truco.truco_user_service.service.UserStatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserStatsController {

    private static final String STATS = "/stats";

    private final UserStatsService userStatsService;

    public UserStatsController(UserStatsService userStatsService) {
        this.userStatsService = userStatsService;
    }

    @GetMapping(path = STATS)
    public ResponseEntity<Optional<UserStats>> getStatsGames(@RequestParam String id){
        return ResponseEntity.ok(userStatsService.getUserStats(id));
    }
}
