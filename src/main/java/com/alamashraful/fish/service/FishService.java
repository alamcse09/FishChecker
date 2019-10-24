package com.alamashraful.fish.service;

import com.alamashraful.fish.models.Fish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FishService {

    @Autowired
    FishRepository fishRepository;

    public Fish save( Fish fish ){

        return fishRepository.save( fish );
    }

    public Optional <Fish> findById(Long id ){

        return fishRepository.findById( id );
    }

    public List<Fish> findAll(){

        return fishRepository.findAll();
    }
}
