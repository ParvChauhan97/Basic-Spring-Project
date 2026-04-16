package com.system.user.UserSystem.Learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyClass implements CommandLineRunner {

    @Override
    public void run(String ... args) throws Exception {
        System.out.println("My Spring Project");
    }
}
