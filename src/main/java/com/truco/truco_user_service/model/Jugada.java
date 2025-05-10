package com.truco.truco_user_service.model;

import com.truco.truco_user_service.enums.Accion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jugada {

    Mano mano1;
    Mano mano2;
    List<Accion> acciones;
    String puntaje1;
    String puntaje2;

}
