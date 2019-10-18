package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public  abstract class CAspect {
	@Pointcut
	abstract void beforetest();
	
	@After("beforetest()")
	public void roundtest(JoinPoint jp) {
		System.out.println("joinPoint called test finished!");
	}
}

