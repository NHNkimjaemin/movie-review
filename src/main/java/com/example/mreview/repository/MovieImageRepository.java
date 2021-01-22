package com.example.mreview.repository;

import com.example.mreview.entity.MovieImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long> {

    @Modifying
    @Query("delete from MovieImage m where m.movie.mno= :mno")
    void deleteByMovie(Long mno);
}
