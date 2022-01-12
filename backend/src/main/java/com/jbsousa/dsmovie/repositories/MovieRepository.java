package com.jbsousa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
