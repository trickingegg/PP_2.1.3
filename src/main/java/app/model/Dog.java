package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Hello, I'm a dog";
    }
}
