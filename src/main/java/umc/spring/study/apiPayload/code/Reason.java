package umc.spring.study.apiPayload.code;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class Reason {
    private final String message;
    private final String code;
    private final boolean isSuccess;
    private final HttpStatus httpStatus;
}

