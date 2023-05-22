package com.mvc;

import com.mvc.mapper.ClazzMapper;
import com.mvc.mapper.StudentMapper;
import com.mvc.pojo.Clazz;
import com.mvc.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.PrintStream;

@SpringBootTest
class Lession09WebApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ClazzMapper clazzMapper;

    @Test
    void contextLoads() {
        Student zs = studentMapper.selectByName("李四");
        System.out.println(zs);
        Clazz clazz = clazzMapper.selectByid(1001);
        System.out.println(clazz);
    }

}
