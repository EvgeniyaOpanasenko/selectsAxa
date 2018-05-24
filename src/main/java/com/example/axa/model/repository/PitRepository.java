package com.example.axa.model.repository;

import com.example.axa.model.Pit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PitRepository extends JpaRepository<Pit, Long> {
}
