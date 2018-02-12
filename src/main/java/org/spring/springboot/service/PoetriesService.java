package org.spring.springboot.service;

import org.spring.springboot.domain.Poetries;

import java.util.List;

/**
 * Created by Administrator on 2018/2/12.
 */
public interface PoetriesService {
    Poetries findPoetriesById(Integer id);

    List<Poetries> findAll();
}
