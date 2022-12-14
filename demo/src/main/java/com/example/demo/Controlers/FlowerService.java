package com.example.demo.Controlers;

import com.example.demo.Items.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.demo.Items.FlowerColor.BLUE;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void addNewFlower(Flower flower) {
        System.out.println(flower);
    }
}
