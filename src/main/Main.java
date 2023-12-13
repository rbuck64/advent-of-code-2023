package main;

import dayOne.DayOne;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        // DAY ONE
        DayOne dayOne = new DayOne();
        int result = dayOne.sumIntsFromFile("src/dayOne/dayOneInput.txt");
        System.out.print("Day One Part One answer: ");
        System.out.println(result);
        result = dayOne.sumIntsFromFilePtTwo("src/dayOne/dayOneInput.txt");
        System.out.print("Day One Part Two answer: ");
        System.out.println(result);
    }
}