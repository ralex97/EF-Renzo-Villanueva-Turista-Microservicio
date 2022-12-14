package com.idat.EC4TuristaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC4TuristaMicroservicio.models.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {
  
}
