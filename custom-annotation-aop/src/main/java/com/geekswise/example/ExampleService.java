package com.geekswise.example;

import com.geekswise.example.aop.ExecutionTimeLog;
import org.springframework.stereotype.Service;

/**
 * Created by Ahn on 2017. 4. 3..
 */
@Service
public class ExampleService {

    @ExecutionTimeLog
    public void service() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("서비스 실행");
    }

}
