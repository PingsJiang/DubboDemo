package com.daliy;

import com.daliy.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("消费者已启动。。。");
        DemoService demoService = (DemoService) context.getBean(DemoService.class);
        System.out.println(demoService.getPermissions(1L));
    }
}
