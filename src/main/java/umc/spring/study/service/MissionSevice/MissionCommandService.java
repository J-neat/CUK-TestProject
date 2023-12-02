package umc.spring.study.service.MissionSevice;

import umc.spring.study.domain.Mission;
import umc.spring.study.web.dto.MissionRequestDTO;

public interface MissionCommandService {
    Mission challengeMission(MissionRequestDTO.ChallengeDto request);
}
