package com.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//扫描接口的位置
@MapperScan("com.mybatis.mapper")
//如果想要每个接口都要变成实现类，那么需要在每个接口类上加上@Mapper注解，比较麻烦，解决这个问题用@MapperScan
//
//2、@MapperScan
//作用：指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
//添加位置：是在Springboot启动类上面添加，
@SpringBootApplication
public class Lession08MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lession08MybatisApplication.class, args);
    }

}
