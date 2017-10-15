package work;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectHelper {

    public void before(String act){
        System.out.println("Before in XML " + act);
    }

    public void after(){
        System.out.println("After in XML");
    }

    public void around(ProceedingJoinPoint joinPoint ){
        System.out.println("Around before in XML");

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("Around after in XML");
    }

    public void afterThrowing(){

        System.out.println("Exception in XML");
    }
    public void afterReturning(){
        System.out.println("Good proceed in XML");
    }
}
