package com.example.axa.model.repository;

import com.example.axa.model.Repairing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RepairingRepository extends JpaRepository<Repairing, Long> {
}
