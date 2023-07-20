package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// Run the Spring Boot application and get the application context
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        // Get the Calculator bean from the application context
        Calculator calculator = context.getBean(Calculator.class);

        // Test the Calculator functionality
        int num1 = 10;
        int num2 = 5;

        System.out.println("Adding: " + num1 + " + " + num2 + " = " + calculator.add(num1, num2));
        System.out.println("Subtracting: " + num1 + " - " + num2 + " = " + calculator.subtract(num1, num2));
        System.out.println("Multiplying: " + num1 + " * " + num2 + " = " + calculator.multiply(num1, num2));

        try {
            System.out.println("Dividing: " + num1 + " / " + num2 + " = " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Close the application context
        context.close();
    }

	}
