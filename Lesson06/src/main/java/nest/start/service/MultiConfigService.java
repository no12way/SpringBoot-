package nest.start.service;

import nest.start.bean.AppBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MultiConfigService {
    @Value("${spring.redis.host}")
    private String redis;

    //多环境配置时激活开发环境
    @Value("${myapp.memo}")
    private String memo;

    @Autowired
    private AppBean appBean;
    public void print(){
        System.out.println("redis="+redis);
        System.out.println("memo="+memo);
        //这里的appBean用了一个代理模式
        System.out.println("appBean.getClass()"+appBean.getClass());
    }
}
