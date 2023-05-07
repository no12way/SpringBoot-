package nest.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Strength {

    @Before("execution(* nest.service.impl.SomeServiceImpl.save(..))")
    public void log(JoinPoint jp){
        //取出当前方法的名称
        String name = jp.getSignature().getName();
        System.out.println(name+"方法执行前的前置通知");
    }
}
