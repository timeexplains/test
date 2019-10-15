package aop;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class XAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		     Method method = arg0.getMethod();
	         Object[] arguments = arg0.getArguments();
	         Object target = arg0.getThis();
	         System.out.println("调用"+target+"的"+method.getName()+"方法。方法入参："+Arrays.toString(arguments));
	         
	         try {
	             Object result = arg0.proceed();
	             System.out.println("调用"+target+"的"+method.getName()+"方法。方法返回值："+result);
	             return result;
	         } catch (Exception e) {
	             System.out.println(method.getName()+"方法异常："+e);
	         }
	         return null;
	}

}
