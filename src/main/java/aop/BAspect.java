package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public abstract class BAspect {
	@Pointcut
	abstract void access();
	
	@Before("access()")
	public void before(JoinPoint jp) {
		System.out.println("BAspect called!");
	}
}
