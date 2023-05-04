package com.start.pk2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ReadConfig {
//环境对象,可以取出properties,yml,环境变量的值
    @Autowired
    private Environment environment;

    public void print(){
        //获取某个key的值
        String name = environment.getProperty("app.name");
        //判断某个key的值是否存在
        if (environment.containsProperty("app.owner")){
            System.out.println("app.owner键值对存在");
        }
        //读取key的值,转为期望的类型,同时提供默认值
        Integer port = environment.getProperty("app.porrt",Integer.class,9009);
        System.out.println("name="+name+" port="+port );


    }
}
