package com.springdemo.library

import groovy.util.logging.Log4j
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
@Log4j
class PerformanceMonitor {

    @Pointcut("execution(* com.springdemo.library..save* (..))")
    private void measurePerformanceOfSaveMethods() {}

    @Around("measurePerformanceOfSaveMethods()")
    def logTransactionTime(ProceedingJoinPoint pjp) {
        Long startTime = System.currentTimeMillis()
        Object retVal = pjp.proceed();
        Long endTime = System.currentTimeMillis()
        println("Time taken to execute ${pjp.getTarget().getClass().getName()}: " + ((endTime - startTime) / 1000) + " secs")
        return retVal;

    }
}
