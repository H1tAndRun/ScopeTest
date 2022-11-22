package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean("car",Car.class);
        System.out.println(car);
        Car car1 =context.getBean("car",Car.class);
        System.out.println(car1);
    }
}