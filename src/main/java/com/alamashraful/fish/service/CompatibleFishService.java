package com.alamashraful.fish.service;

import com.alamashraful.fish.models.CompatibleFish;
import com.alamashraful.fish.models.Fish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompatibleFishService {

    @Autowired
    CompatibleFishRepository compatibleFishRepository;

    public CompatibleFish save( CompatibleFish compatibleFish ){

        return compatibleFishRepository.save( compatibleFish );
    }

    public Optional <CompatibleFish> findById(Long id ){

        return compatibleFishRepository.findById( id );
    }

    public Optional<List<CompatibleFish>> findBySourceFish(Fish sourceFish ){

        return compatibleFishRepository.findBySourceFish( sourceFish );
    }

    public Optional<List<CompatibleFish>> findByDestinationFish( Fish sourceFish ){

        return compatibleFishRepository.findByDestinationFish( sourceFish );
    }
}
