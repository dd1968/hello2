package com.example.hello2;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String helloTemplate = "Hi, %s!";
    private static final String goodbyeTemplate = "Bye, %s!";
    private static final String alohaTemplate = "Aloha, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(helloTemplate, name));
    }
    @GetMapping("/goodbye")
    public Greeting goodbye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(goodbyeTemplate, name));
    }
    @GetMapping("/aloha")
    public Greeting aloha(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(alohaTemplate, name));
    }
}