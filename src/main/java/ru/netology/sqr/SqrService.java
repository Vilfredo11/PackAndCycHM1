package ru.netology.sqr;

public class SqrService {
    public int sqr(int max, int min) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}

