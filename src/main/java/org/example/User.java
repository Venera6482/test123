package org.example;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode


public class User {
    private String name;
    private int age;
    public void sayHi(){
        System.out.println("Hello from " + name);
    }
    public void login(String userName, String password){
        System.out.println("Login");

    }
}
