package com.example.demo.mapper;

import com.example.demo.People;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yyuanyan
 * @create 2020 - 03 - 06 - 21:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class PeopleMapperTest{

    @Autowired
    PeopleMapper peopleMapper;
    @Test
    public void testlistAll() throws Exception{

        //assertNotNull(peopleMapper);

        peopleMapper.getAllPeople().forEach(System.out::println);
    }
}