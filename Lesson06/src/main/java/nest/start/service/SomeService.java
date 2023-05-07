package nest.start.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.StringJoiner;

@Service
public class SomeService {
    @Value("${app.name}")
    private String name;

    @Value("${app.owner}")
    private String owner;
    //通过properties读取数据,使用value注解
    //防止配置键写错,可以添加:加默认值,那么找不到的时候将会取默认值
    //@value只能读取单一值
    @Value("${app.porrt:8080}")
    private Integer port;

    public void printValue(){
        StringJoiner stringJoiner = new StringJoiner(";");
        stringJoiner.add(name).add(owner).add(String.valueOf(port));
        String result = stringJoiner.toString();
        System.out.println("result"+result);
    }
}
