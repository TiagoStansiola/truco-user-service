package com.truco.truco_user_service.controller;


import com.truco.truco_user_service.model.HistoryPartida;
import com.truco.truco_user_service.service.HistoryPartidaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class HistoryPartidaController {

    private static final String HISTORY = "/history";

    private final HistoryPartidaService historyPartidaService;

    public HistoryPartidaController(HistoryPartidaService historyPartidaService) {
        this.historyPartidaService = historyPartidaService;
    }

    @GetMapping(path = HISTORY)
    public ResponseEntity<Optional<List<HistoryPartida>>> getHistoryGames(String id){
        return ResponseEntity.ok(historyPartidaService.getHistoryByJugador(id));
    }
}
