package nest.bundle;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 绑定bean
 */
//取消代理机制,因为这个bean是独立的,同时,配置@Configuration注解后该类会被自动纳入容器管理
//如果没有configuration注解,可以使用@EnableConfigurationProperties(XXx.class)或@ConfigurationPropertiesScan(包名)在启动类上面配置,这个注解专门寻找@ConfigurationProperties注解,把他的对象诸如人到spring容器中
//@Configuration(proxyBeanMethods = false)
@Component//可以用这个注解,把对象纳入容器管理
//它可以让开发者将整个配置文件，映射到对象中，比@Value 效率更高。
@ConfigurationProperties(prefix = "app")
public class NestAppBean {
    private String name;
    private String owner;
    private Integer port;
    private Security security;
//set方法是必不可少的,会先用无参构造函数创建单例对象,然后通过set属性注入
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "NestAppBean{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", port=" + port +
                ", security=" + security +
                '}';
    }
}
