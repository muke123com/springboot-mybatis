package org.spring.springboot.dao;

import org.spring.springboot.domain.Poetries;

import java.util.List;

public interface PoetriesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Poetries record);

    int insertSelective(Poetries record);

    Poetries selectByPrimaryKey(Integer id);

    List<Poetries> findAll();

    int updateByPrimaryKeySelective(Poetries record);

    int updateByPrimaryKeyWithBLOBs(Poetries record);

    int updateByPrimaryKey(Poetries record);
}