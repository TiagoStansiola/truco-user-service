package com.truco.truco_user_service.service.impl;

import com.truco.truco_user_service.model.HistoryPartida;
import com.truco.truco_user_service.repository.HistoryPartidaRepository;
import com.truco.truco_user_service.service.HistoryPartidaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryPartidaServiceImpl implements HistoryPartidaService {

    private final HistoryPartidaRepository historyPartidaRepository;

    public HistoryPartidaServiceImpl(HistoryPartidaRepository historyPartidaRepository) {
        this.historyPartidaRepository = historyPartidaRepository;
    }

    @Override
    public Optional<List<HistoryPartida>> getHistoryByJugador(String jugador) {
        return Optional.ofNullable(historyPartidaRepository.findByJugador(jugador));
    }
}
