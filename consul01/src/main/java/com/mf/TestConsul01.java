package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestConsul01
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/1
 * @Version V1.0
 **/
@SpringBootApplication
@RestController
@EnableScheduling
public class TestConsul01 {
    public static void main(String[] args){

        SpringApplication.run(TestConsul01.class,args);

    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("----------test-----------");
        return "ok";
    }

}
