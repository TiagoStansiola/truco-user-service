package com.truco.truco_user_service.service;

import com.truco.truco_user_service.model.UserStats;

import java.util.Optional;

public interface UserStatsService {

    Optional<UserStats> getUserStats(String id);
}
