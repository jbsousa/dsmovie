package com.jbsousa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.dsmovie.entities.Score;
import com.jbsousa.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
