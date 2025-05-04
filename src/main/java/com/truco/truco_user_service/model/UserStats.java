package com.truco.truco_user_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_stats")
public class UserStats {

    @Id
    private String id;

    private String usuario;
    private int victorias;
    private int derrotas;
}
