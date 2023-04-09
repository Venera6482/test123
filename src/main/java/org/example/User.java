package org.example;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode


public class User {
    private String name;
    private int age;
    public String sayHi(){
        return "Hello from " + name;
    }
    public String login(String userName, String password){
       return "Login";

    }
}
