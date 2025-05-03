package com.truco.truco_user_service.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user-account")
public class UserAccount {

    @Id
    private String  id;
    private String nombre;
    private String email;

}
