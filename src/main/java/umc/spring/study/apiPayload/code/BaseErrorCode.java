package umc.spring.study.apiPayload.code;

public interface BaseErrorCode {
//    이를 구체화 하는 Status에서 두 개의 메소드를 반드시 Override
    public ErrorReasonDTO getReason();

    public ErrorReasonDTO getReasonHttpStatus();
}
