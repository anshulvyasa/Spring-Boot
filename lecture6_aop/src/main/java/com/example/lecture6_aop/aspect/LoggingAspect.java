/*Find Different Decortors Here:- https://docs.spring.io/spring-framework/reference/core/aop/ataspectj/pointcuts.html */

package com.example.lecture6_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.lecture6_aop.service.ProductService.addProduct(..))")
    public void before() {
        System.out.println("Before Add Product Service Methord is Executed");
    }

    @After("execution(* com.example.lecture6_aop.service.ProductService.*(..))")
    public void after() {
        System.out.println("After Add Product Service Methord is Executed");
    }

    @After("execution(* com.example.lecture6_aop.service.*.*(..))")
    public void coveringAllClassesOfAPackage() {
        System.out.println("After Add Product Service Methord is Executed");
    }

    @Around("execution(* com.example.lecture6_aop.service.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        // Before
        System.out.println("Before In Around");

        Object result=null;
        try{
              result=joinPoint.proceed();
              System.out.println(result);
        }
       catch (Throwable e) {
            e.printStackTrace();
        }
        // After 
        System.out.println("After In Around");

        return result;
    }


    @Pointcut("execution(* com.example.lecture6_aop.service.*.*(..))")
    private void anyPointCut(){}

    @Around("anyPointCut()")
    public Object around2(ProceedingJoinPoint joinPoint){
        // Before
        System.out.println("Before In Around");

        Object result=null;
        try{
              result=joinPoint.proceed();
              System.out.println(result);
        }
       catch (Throwable e) {
            e.printStackTrace();
        }
        // After 
        System.out.println("After In Around");

        return result;
    }
}
