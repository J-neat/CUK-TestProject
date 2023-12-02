package umc.spring.study.web.dto;

import lombok.Getter;
import umc.spring.study.domain.enums.MissionStatus;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class MissionRequestDTO {

    @Getter
    public static class ChallengeDto {
        @NotNull
        private Long storeId;

        @NotNull
        @Min(1)
        private Integer reward;

        @NotNull
        private LocalDate deadline;

        @NotBlank
        private String missionSpec;

        @NotBlank
        private MissionStatus missionStatus;
    }
}
