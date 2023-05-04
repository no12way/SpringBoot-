package com.start.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 表示使用bean对象读取配置项
 * prefix表示配置文件中多个key的公共开始部分
 * 剩下的key的名字和属性名相同
 */
//注意,属性必须是非静态的
//或者换成@Configuration表示配置类交由容器管理
//@Component
    @Configuration(proxyBeanMethods = false)//不启动代理模式,创建得更快(建议)(默认是真),创建普通bean非spring代理
    //如果这个bean和其他bean没关系,这里建议用非代理模式(优点:性能更好)
//只是用于注解的绑定,并不会纳入容器
@ConfigurationProperties(prefix = "app")
public class AppBean {
    //key的名称和属性名相同,框架调用setXXX方法给属性名赋值
    //调用无参构造创建bean对象,再调用set方法给属性赋值
    String name;
    String owner;
    String porrt;

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPorrt(String porrt) {
        this.porrt = porrt;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getPorrt() {
        return porrt;
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", porrt='" + porrt + '\'' +
                '}';
    }
}
