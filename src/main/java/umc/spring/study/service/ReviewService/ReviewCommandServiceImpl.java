package umc.spring.study.service.ReviewService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.converter.ReviewConverter;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.Review;
import umc.spring.study.repository.MemberRepository;
import umc.spring.study.repository.ReviewRepository;
import umc.spring.study.web.dto.ReviewRequestDTO;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReviewCommandServiceImpl implements ReviewCommandService{
    private final ReviewRepository reviewRepository;
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Review writeReview(ReviewRequestDTO.WriteDTO request) {

        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid member ID"));

        Review review = ReviewConverter.toReview(request);
        review.setMember(member);
        return reviewRepository.save(review);
    }
}
