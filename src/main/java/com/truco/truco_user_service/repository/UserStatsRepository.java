package com.truco.truco_user_service.repository;

import com.truco.truco_user_service.model.UserStats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserStatsRepository extends MongoRepository<UserStats, String> {

    Optional<UserStats> findByUsuario(String usuario);

}