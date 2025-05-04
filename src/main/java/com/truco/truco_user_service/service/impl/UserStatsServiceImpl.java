package com.truco.truco_user_service.service.impl;

import com.truco.truco_user_service.model.UserStats;
import com.truco.truco_user_service.repository.UserStatsRepository;
import com.truco.truco_user_service.service.UserStatsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserStatsServiceImpl implements UserStatsService {

    private final UserStatsRepository userStatsRepository;

    public UserStatsServiceImpl(UserStatsRepository userStatsRepository) {
        this.userStatsRepository = userStatsRepository;
    }

    @Override
    public Optional<UserStats> getUserStats(String id) {
        return userStatsRepository.findByUsuario(id);
    }
}
