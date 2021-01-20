package com.example.mreview.repository;


import com.example.mreview.entity.Member;
import com.example.mreview.entity.Movie;
import com.example.mreview.entity.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTests {
    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void testGetMovieReviews() {
        Movie movie = Movie.builder().mno(92L).build();

        List<Review> result = reviewRepository.findByMovie(movie);

        result.forEach(review -> {
            System.out.println(review.getReviewnum());
            System.out.println(review.getGrade());
            System.out.println(review.getText());
            System.out.println(review.getMember().getEmail());
//            System.out.println(review.getReviewnum());
        });
    }

//    @Test
//    public void insertMovieReviews() {
//
//        IntStream.rangeClosed(1, 200).forEach(i -> {
//            Long mno = (long)(Math.random() * 100) + 1;
//
//            Long mid = ((long)(Math.random()*100) + 1);
//
//            Member member = Member.builder()
//                    .mid(mid)
//                    .build();
//
//            Movie movie = Movie.builder()
//                    .mno(mno)
//                    .build();
//
//            Review movieReview = Review.builder()
//                    .member(member)
//                    .movie(movie)
//                    .grade((int)(Math.random() * 5) + 1)
//                    .text("재미나요" + i)
//                    .build();
//
//
//            reviewRepository.save(movieReview);
//
//
//        });
//    }




}
