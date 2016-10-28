package aspect.annotation_based;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* housework())")
    public void before(JoinPoint joinPoint){//JoinPoint 는 @Before 에서 선언된 메소드 즉 aspect.Girl.housework() 를 의미
        System.out.println("문을 연다.");
    }

    @After("execution(* housework())")
    public void after(){//JoinPoint 는 @Before 에서 선언된 메소드 즉 aspect.Girl.housework() 를 의미
        System.out.println("잔다.");
    }
}
