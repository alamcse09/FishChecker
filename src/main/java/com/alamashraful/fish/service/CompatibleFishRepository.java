package com.alamashraful.fish.service;

import com.alamashraful.fish.models.CompatibleFish;
import com.alamashraful.fish.models.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompatibleFishRepository extends JpaRepository<CompatibleFish, Long> {
    
    Optional<List<CompatibleFish>> findBySourceFish(Fish sourceFish);

    Optional<List<CompatibleFish>> findByDestinationFish(Fish sourceFish);
}
