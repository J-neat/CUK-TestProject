package umc.spring.study.apiPayload.code.status;

import lombok.Builder;
import lombok.Getter;

@Getter
public enum SuccessStatus {
    _OK("SUCCESS200", "요청이 성공적으로 처리되었습니다.");
    private final String code;
    private final String message;
    SuccessStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }
}

