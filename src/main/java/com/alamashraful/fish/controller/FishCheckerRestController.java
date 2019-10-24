package com.alamashraful.fish.controller;

import com.alamashraful.fish.enums.FishCompatibility;
import com.alamashraful.fish.models.CompatibleFish;
import com.alamashraful.fish.models.Fish;
import com.alamashraful.fish.service.CompatibleFishService;
import com.alamashraful.fish.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping( "/api" )
public class FishCheckerRestController {

    @Autowired
    private FishService fishService;

    @Autowired
    private CompatibleFishService compatibleFishService;

    @RequestMapping( "/get-compatibles/{id}" )
    public List<CompatibleFish> findAllCompatibleFish(

            @PathVariable( "id" ) Long sourceId
    ){

        Optional <Fish> sourceFish = fishService.findById( sourceId );

        if( sourceFish.isPresent() ){

            Optional<List<CompatibleFish>> compatibleFishList = compatibleFishService.findBySourceFish( sourceFish.get() );
            if( compatibleFishList.isPresent() )
                return compatibleFishList.get();
            else
                return Collections.emptyList();
        }else{

            return Collections.emptyList();
        }
    }

    @GetMapping( "/insert" )
    public String insert(){

        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();
        Fish fish4 = new Fish();

        fish1.setName( "Betta" );
        fish2.setName( "Guppy" );
        fish3.setName( "Moli" );
        fish4.setName( "Gold" );

        CompatibleFish compatibleFish1 = new CompatibleFish();
        compatibleFish1.setSourceFish( fish1 );
        compatibleFish1.setDestinationFish( fish4 );
        compatibleFish1.setFishCompatibility( FishCompatibility.NOT_COMPATIBLE );

        CompatibleFish compatibleFish2 = new CompatibleFish();
        compatibleFish2.setSourceFish( fish1 );
        compatibleFish2.setDestinationFish( fish2 );
        compatibleFish2.setFishCompatibility( FishCompatibility.COMPATIBLE );


        fishService.save( fish1 );
        fishService.save( fish2 );
        fishService.save( fish3 );
        fishService.save( fish4 );

        compatibleFishService.save( compatibleFish1 );
        compatibleFishService.save( compatibleFish2 );

        return "done";
    }
}
