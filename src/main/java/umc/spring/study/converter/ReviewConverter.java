package umc.spring.study.converter;

import umc.spring.study.domain.Review;
import umc.spring.study.web.dto.ReviewRequestDTO;
import umc.spring.study.web.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

public class ReviewConverter {
    public static ReviewResponseDTO.WriteResultDTO toWriteResultDTO(Review review){
        return ReviewResponseDTO.WriteResultDTO.builder()
                .reviewId(review.getId())
                .memberId(review.getMember().getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
    public static Review toReview(ReviewRequestDTO.WriteDTO request){
        return Review.builder()
                .title(request.getTitle())
                .score(request.getScore())
                .build();
    }
}
