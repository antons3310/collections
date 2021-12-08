package ru.ashebalkin.skypro.course2.lesson6.collections.service;

import java.util.List;

public interface CollectionService {

    List<Integer> getOddNumbers();

    List<Integer> getEvenNumbers();

    List<String> getUniqueWords();

    List<Integer> removeOddNumbers();

    int getCountUniqueWords();

}
