package umc.spring.study.converter;

import umc.spring.study.domain.Mission;
import umc.spring.study.domain.Store;
import umc.spring.study.web.dto.MissionRequestDTO;
import umc.spring.study.web.dto.MissionResponseDTO;

public class MissionConverter {

    public static MissionResponseDTO.ChallengeResultDTO toChallengeResultDTO(Mission mission){
        Long memberId = null;
        if (!mission.getMemberMissionList().isEmpty()) {
            memberId = mission.getMemberMissionList().get(0).getMember().getId();
        }
        return MissionResponseDTO.ChallengeResultDTO.builder()
                .memberId(mission)
                .reward(mission.getReward())
                .deadline(mission.getDeadline())
                .missionSpec(mission.getMissionSpec())
                .missionStatus(mission.getMissionStatus())
                .storeId(mission.getStore().getId())
                .build();
    }

    public static Mission toMission(MissionRequestDTO.ChallengeDto request, Store store){
        return Mission.builder()
                .reward(request.getReward())
                .deadline(request.getDeadline())
                .missionSpec(request.getMissionSpec())
                .store(store)
                .build();
    }
}
