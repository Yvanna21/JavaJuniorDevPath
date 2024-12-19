package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/hello") // This will be the base URL for all
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/json") // This will be the base URL for JSON response
    public Message getMessage(){
        return new Message("Hello World! This is a JSON response.");
    }

    //Intern class to represent a message
    public static class Message {
        private String text;

        //Constructor
        public  Message(String text){
            this.text=text;
        }
        // Getter and Setter
        public String getText(){
            return text;
        }
        public void setText(String text){
            this.text=text;
        }
    }
}
