package com.alamashraful.fish.service;

import com.alamashraful.fish.models.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {
}
