package main;

import dayOne.DayOne;
public class Main {

    private static final String DAY_ONE_FILE_NAME = "dayOneInput.txt";

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        runDayOne();
    }

    public static void runDayOne() {
        DayOne dayOne = new DayOne(DAY_ONE_FILE_NAME, ProblemPart.ONE);
        int result = dayOne.sumIntsFromFile();
        System.out.println("Day One Part One answer: " + result);

        dayOne.setProblemPart(ProblemPart.TWO);
        result = dayOne.sumIntsFromFilePtTwo();
        System.out.print("Day One Part Two answer: " + result);

    }
}