package ru.netology.sqr;

public class SqrService {
    public static void main(String[] args) {


        int numberOne = 10;
        int numberTwo = 99;
        int j = 0;

        for (int i = 0; i < numberTwo; i++) {
            if (i * i > numberOne)
                if (i * i < numberTwo) {

                    j = j + 1;
                    System.out.println(" Корень из " + i * i + " равен " + i);
                }

        }
        System.out.println(" Количество  " + j);
    }


}
