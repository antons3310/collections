package ru.ashebalkin.skypro.course2.lesson6.collections.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ashebalkin.skypro.course2.lesson6.collections.service.CollectionService;

import java.util.List;

@RestController
@RequestMapping("/get")
public class CollectionController {

    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping("/oddNumbers")
    public List<Integer> getOddNumbers() {
        return collectionService.getOddNumbers();
    }

    @GetMapping("/removeoddNumbers")
    public List<Integer> removeOddNumbers() {
        return collectionService.removeOddNumbers();
    }

    @GetMapping("/evennumbers")
    public List<Integer> getEvenNumbers() {
        return collectionService.getEvenNumbers();
    }

    @GetMapping("/uniquewords")
    public List<String> getUniqueWords() {
        return collectionService.getUniqueWords();
    }

    @GetMapping("/countuniquewords")
    public int getCountUniqueWords() {
        return collectionService.getCountUniqueWords();
    }

}
