package org.spring.springboot.controller;

import org.spring.springboot.domain.Poetries;
import org.spring.springboot.service.PoetriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoetriesRestController {

    @Autowired
    private PoetriesService poetriesService;

//    @RequestMapping(value = "/api/poetries", method = RequestMethod.GET)
//    public Poetries findPoetries(@RequestParam(value = "id") Integer id){
//        return poetriesService.findPoetriesById(id);
//    }

    @RequestMapping(value = "/api/poetries", method = RequestMethod.GET)
    public List<Poetries> findPoetries(){
        return poetriesService.findAll();
    }

}
