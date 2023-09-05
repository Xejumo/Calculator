package com.kodilla.kodillacoursecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseCalculatorApplication.class, args);
        Calculator calctulator = new Calculator();
        double result = calctulator.calc(1.55,3.22);
        System.out.println("wynik odejmowania to:" + result);
        double result1 = calctulator.calc1(5.32,8.77);
        System.out.println("wynik dodawania to :" + result1);
    }

}
