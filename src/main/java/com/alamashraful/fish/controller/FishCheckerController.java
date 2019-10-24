package com.alamashraful.fish.controller;

import com.alamashraful.fish.models.CompatibleFish;
import com.alamashraful.fish.service.CompatibleFishService;
import com.alamashraful.fish.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FishCheckerController {

    @GetMapping( "/check" )
    public String check(){

        return "check";
    }
}
