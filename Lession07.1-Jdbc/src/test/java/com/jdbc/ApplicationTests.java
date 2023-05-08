package com.jdbc;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class ApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
        String sql = "select count(*) from t_act";
        Long count = jdbcTemplate.queryForObject(sql,Long.class);
        System.out.println("记录总数"+count);
    }

}
