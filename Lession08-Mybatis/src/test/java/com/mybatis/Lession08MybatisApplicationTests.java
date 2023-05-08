package com.mybatis;

import com.mybatis.mapper.ActMapper;
import com.mybatis.pojo.Act;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Lession08MybatisApplicationTests {
    @Autowired
    private ActMapper actMapper;

    @Test
    void contextLoads() {
        Integer integer = actMapper.numCount();
        System.out.println(integer);
        List<Act> acts = actMapper.selectAll();
        for (Act act : acts) {
            System.out.println(act);
        }
        Act act001 = actMapper.selectByNo("act001");
        System.out.println("act001相关信息: "+act001);
    }
}