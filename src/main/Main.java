package main;

import dayOne.DayOne;
import dayTwo.DayTwo;

public class Main {

    private static final String DAY_ONE_FILE_NAME = "dayOneInput.txt";
    private static final String DAY_TWO_FILE_NAME = "dayTwoInput.txt";

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
//        runDayOne();
        runDayTwo();
    }

    public static void runDayTwo() {
        DayTwo dayTwo = new DayTwo(DAY_TWO_FILE_NAME, ProblemPart.ONE);
        int result = dayTwo.solvePartOne();
        System.out.println("Day Two Part One answer: " + result);
        result = dayTwo.solvePartTwo();
        System.out.println("Day Two Part Two answer: " + result);
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