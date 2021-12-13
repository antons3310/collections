package ru.ashebalkin.skypro.course2.lesson6.collections.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class CollectionServiceImpl implements CollectionService {

    private final List<Integer> nums = new ArrayList<>(List.of(12, 112, 12, 22, 55, 88, 13, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private final List<String> words = new ArrayList<>(List.of("каждый", "охотник", "хочет", "дичь", "дичь", "хочет", "жить", "свободно", "охотник", "хочет", "есть"));

    @Override
    public List<Integer> getOddNumbers() {
        List<Integer> oddNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 != 0) {
                oddNums.add(num);
            }
        }

        return oddNums;
    }

    @Override
    public List<Integer> removeOddNumbers() {
        List<Integer> oddNums = new ArrayList<>(nums);

        oddNums.removeIf(num -> num % 2 == 0);

        return oddNums;
    }

    @Override
    public List<Integer> getEvenNumbers() {
        List<Integer> oddNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (!oddNums.contains(num)) {
                    oddNums.add(num);
                }
            }
        }

        oddNums.sort(Integer::compareTo);

        return oddNums;
    }

    @Override
    public List<String> getUniqueWords() {
        List<String> uniqWords = new ArrayList<>();

        for (String word : words) {
            if (!uniqWords.contains(word)) {
                uniqWords.add(word);
            }
        }

        return uniqWords;

    }

    @Override
    public int getCountUniqueWords() {
        int count = 0;

        List<String> uniqWords = new ArrayList<>(words);
        uniqWords.sort(Comparator.naturalOrder());
        if (uniqWords.get(0).equals(uniqWords.get(1))) {
            count++;
        }

        for (int i = 0; i < uniqWords.size(); i++) {
            if (i + 1 < uniqWords.size()) {
                if (uniqWords.get(i).equals(uniqWords.get(i + 1))) {
                    count++;
                }
            }
        }

        return count;
    }
}
