package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.dao.PoetriesDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Poetries;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.PoetriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoetriesServiceImpl implements PoetriesService {

    /**
     *
     */
    @Autowired
    private PoetriesDao poetriesDao;

    @Override
    public Poetries findPoetriesById(Integer id) {
        return poetriesDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Poetries> findAll() {
        return poetriesDao.findAll();
    }
}
