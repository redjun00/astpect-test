package aspect.xml_based;

import org.aspectj.lang.JoinPoint;

public class MyAspect {

    public void before(JoinPoint joinPoint){//JoinPoint 는 @Before 에서 선언된 메소드 즉 aspect.Girl.housework() 를 의미
        System.out.println("문을 연다.");
    }

    public void after(){//JoinPoint 는 @Before 에서 선언된 메소드 즉 aspect.Girl.housework() 를 의미
        System.out.println("잔다.");
    }
}
