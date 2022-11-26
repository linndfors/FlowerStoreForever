package com.example.demo.Controlers;

import com.example.demo.Items.Flower;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static com.example.demo.Items.FlowerColor.BLUE;
import static com.example.demo.Items.FlowerColor.RED;
import static com.example.demo.Items.FlowerType.ROSE;
import static com.example.demo.Items.FlowerType.TULIP;

@Configuration
public class FlowerConfig {
    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository) {
        return args -> {
            Flower good_flower = new Flower("beautiful flower", 10, ROSE, BLUE, 25);
            Flower no_good_flower = new Flower("not so beautiful flower", 1, TULIP, RED, 10);
            repository.saveAll(List.of(good_flower, no_good_flower));
        };
    }
}
