package com.example.demo.mapper;

import com.example.demo.People;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yyuanyan
 * @create 2020 - 03 - 06 - 21:21
 */

public interface PeopleMapper {
    @Select("select * from people")
    public List<People> getAllPeople();
}
