package work;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectHelper2 {

    @Pointcut("execution(* work.Worker.doWork(..))")
    public void before() {}


    public void bBefore(){
        System.out.println("bBefore");
    }

    @Before("execution(* work.Worker.doWork(..))")
    public void after() {
        System.out.println("Before in class");
    }

    @Around("execution(* work.Worker.doWork(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Around before in class");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Around after in class");
    }
}
