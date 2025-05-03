package com.truco.truco_user_service.dto;

import com.truco.truco_user_service.model.UserAccount;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDto {

    private String id;
    private String nombre;
    private String email;


    public static UserAccountDto toDTO(UserAccount user) {
        return UserAccountDto.builder()
                .id(user.getId())
                .nombre(user.getNombre())
                .email(user.getEmail())
                .build();
    }

}
