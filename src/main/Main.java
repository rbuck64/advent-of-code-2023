package main;

import dayOne.DayOne;

public class Main {

    private static final String DAY_ONE_FILE_NAME = "dayOneInput.txt";

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        runDayOne();
    }

    public static void runDayOne() {
        DayOne dayOne = new DayOne();
        int result = dayOne.sumIntsFromFile(DAY_ONE_FILE_NAME);
        System.out.print("Day One Part One answer: ");
        System.out.println(result);
        result = dayOne.sumIntsFromFilePtTwo(DAY_ONE_FILE_NAME);
        System.out.print("Day One Part Two answer: ");
        System.out.println(result);
    }
}