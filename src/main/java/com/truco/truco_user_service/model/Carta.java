package com.truco.truco_user_service.model;

import com.truco.truco_user_service.enums.Palo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carta {

    String numero;
    Palo palo;
    String imagen;

}
