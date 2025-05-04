package com.truco.truco_user_service.repository;

import com.truco.truco_user_service.model.HistoryPartida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryPartidaRepository extends MongoRepository<HistoryPartida, String> {

    @Query("{ '$or': [ { 'jugador1': ?0 }, { 'jugador2': ?0 } ] }")
    List<HistoryPartida> findByJugador(String jugador);
}
