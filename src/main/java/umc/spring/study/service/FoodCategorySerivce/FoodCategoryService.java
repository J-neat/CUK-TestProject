package umc.spring.study.service.FoodCategorySerivce;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import umc.spring.study.repository.FoodCategoryRepository;

@Service
@RequiredArgsConstructor
public class FoodCategoryService {

    private final FoodCategoryRepository foodCategoryRepository;

    @Transactional(readOnly = true)
    public boolean existsById(Long id) {
        return foodCategoryRepository.existsById(id);
    }
}

