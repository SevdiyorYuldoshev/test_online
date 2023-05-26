package uz.devs.test_online.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {
    private Integer id;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    private String email;
    private String password;
    private LocalDateTime created_date;
    private String picture;
    private String role;
}
