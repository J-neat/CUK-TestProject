package umc.spring.study.service.MissionSevice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.domain.Mission;
import umc.spring.study.domain.Store;
import umc.spring.study.repository.MemberRepository;
import umc.spring.study.repository.MissionRepository;
import umc.spring.study.repository.StoreRepository;
import umc.spring.study.web.dto.MissionRequestDTO;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MissionCommandServiceImpl implements MissionCommandService{

    private final MissionRepository missionRepository;

    private final MemberRepository memberRepository;

    private final StoreRepository storeRepository;

    @Override
    @Transactional
    public Mission challengeMission(MissionRequestDTO.ChallengeDto requestDto) {
        Store store = storeRepository.findById(requestDto.getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("해당 가게가 없습니다. id=" + requestDto.getStoreId()));

        Mission mission = Mission.builder()
                .missionStatus(requestDto.getMissionStatus())
                .reward(requestDto.getReward())
                .deadline(requestDto.getDeadline())
                .missionSpec(requestDto.getMissionSpec())
                .store(store)
                .build();

        missionRepository.save(mission);

        return mission.getId();
    }
    @Transactional(readOnly = true)
    public boolean existsById(Long id) {
        return memberRepository.existsById(id);
    }

}
