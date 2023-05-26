package uz.devs.test_online.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseDto<T> {
    private int code;
    private boolean success;
    private String message;
    private T data;
}
