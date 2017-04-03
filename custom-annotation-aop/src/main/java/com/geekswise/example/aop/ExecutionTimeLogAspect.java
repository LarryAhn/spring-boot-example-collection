package com.geekswise.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Ahn on 2017. 4. 3..
 */
@Aspect
@Component
public class ExecutionTimeLogAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(ExecutionTimeLog)")
    public Object ExecutionTimeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        logger.info("{} : method completed in {} ms", joinPoint.getSignature(), executionTime);
        return proceed;
    }


}
