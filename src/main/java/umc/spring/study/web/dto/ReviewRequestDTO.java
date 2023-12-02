package umc.spring.study.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class ReviewRequestDTO {

    @Getter
    public static class WriteDTO{

        @NotBlank
        String title;

        @NotNull
        Float score;

        @NotNull
        Long memberId;
    }
}
