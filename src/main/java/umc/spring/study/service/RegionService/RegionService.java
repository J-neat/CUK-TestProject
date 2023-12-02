package umc.spring.study.service.RegionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.repository.RegionRepository;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository regionRepository;

    @Transactional(readOnly = true)
    public boolean existsById(Long id) {
        return regionRepository.existsById(id);
    }
}
