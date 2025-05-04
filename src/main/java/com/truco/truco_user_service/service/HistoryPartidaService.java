package com.truco.truco_user_service.service;

import com.truco.truco_user_service.model.HistoryPartida;

import java.util.List;
import java.util.Optional;

public interface HistoryPartidaService {

    Optional<List<HistoryPartida>> getHistoryByJugador(String jugador);
}
