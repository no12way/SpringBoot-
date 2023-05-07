package nest.bundleother;

import nest.bundle.Security;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这里进行第三方对象的绑定
 * 没有属性值,通过配置文件为其注入
 */
//@Configuration标注在类上，@Configuration等价于spring的xml配置文件中的Beans节点
//@Configuration会默认开启cglib代理(基于继承)
@Configuration
//这里表示是一个配置类,可以理解为beans标签
public class ConfigXml {
    //注册一个bean
    //@Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。添加的bean的id为方法名
    @ConfigurationProperties(prefix = "info")
    @Bean
    //这里的security是第三方库中的类,没有相关代码
    public Security infoO(){
        return new Security();
    }
}
