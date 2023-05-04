package com.start;

import com.start.service.SomeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
/**
 * @SpringBootConfiguration:包含configuration
 *            configuration:javaConfig功能,配置类,结合Bean能够将对象注入到spring的ioc容器
 *            有@SpringBootConfiguration的类是一个配置类
 * @EnableAutoConfiguration
 *              开启自动配置,将spring和第三方库中的对象创建好,注入到spring容器
 *              比如DispatcherServlet,避免写xml,去掉样例代码,需要使用的对象,由对象提供
 * @ComponentScan
 *              组件扫描器<conext:component-scan------></conext:component-scan------>
 *              扫描controller,service,repository,component注解,创建他们的对象注入到容器
 *              springboot约定,启动类,作为扫描包的起点
 *              ComponentScan扫描start包和它子包中所有类
 *              把启动类放到根包下面,与扫描有关,启动类会扫描扫描它所属的根包和子包中的所有类
 */
//复合注解
public class Lesson06Application {
    @Bean
    public Date myDate(){
        return new Date();
    }


    public static void main(String[] args) {
        //run方法第一个参数的源(配置类),从合理加载bean,找到bean注入到spring的容器
        //run方法返回值是容器对象app接口接收
        ApplicationContext app = SpringApplication.run(Lesson06Application.class, args);
        SomeService someService = app.getBean("someService", SomeService.class);
        someService.printValue();
    }

}
