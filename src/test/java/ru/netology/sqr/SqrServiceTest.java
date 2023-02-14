package ru.netology.sqr;

public class SqrServiceTest {
    public static void main(String[] args) {


        int numberOne = 10;
        int numberTwo = 99;
        int counter = 0;

        for (int i = 10; i < numberTwo; i++) {
            if (i * i > numberOne)
                if (i * i < numberTwo) {

                    counter = counter + 1;
                    System.out.println(" Корень из " + i * i + " равен " + i);
                }

        }
        System.out.println(" Количество  " + counter);
    }


}
