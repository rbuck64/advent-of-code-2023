package dayTwo;

import main.ProblemPart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DayTwo {

    private String filename;
    private ProblemPart problemPart;
    private HashMap<String, Integer> colorMap;

    public DayTwo(String filename, ProblemPart problemPart) {
        this.filename = filename;
        this.problemPart = problemPart;

        colorMap = new HashMap<String, Integer>();
        colorMap.put("red", 12);
        colorMap.put("green", 13);
        colorMap.put("blue", 14);

    }

    public void setProblemPart(ProblemPart problemPart) {
        this.problemPart = problemPart;
    }

    public int solvePartOne() {
        int result = 0;

        try {
            File file = new File(filename);
            System.out.println("Absolute path: " + file.getAbsolutePath());
            Scanner myReader = new Scanner(file);
            int i = 1;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String game = line.split(": ")[1];

                // need to get rid of prefix of 'Game #'
                List<String> hands = Stream.of(game.split("; ")).map(String::new).toList();
                // now deal with hand
                boolean handIsValid = true;

                for (String hand : hands) {
                    // red 20
                    List<String> colorCounts = Stream.of(hand.split(", ")).toList();
                    for (String colorCount : colorCounts) {
                        System.out.println("Hand: " + hand);
                        String color = colorCount.split(" ")[1];
                        int count = Integer.parseInt(colorCount.split(" ")[0]);
                        if(colorMap.get(color) < count) {
                            handIsValid = false;
                        }
                    }
                }

                if(handIsValid) {
                    result += i;
                }
                i += 1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred for problem 2");
            e.printStackTrace();
        }


        return result;
    }

    public int solvePartTwo() {
        int result = 0;

        try {
            File file = new File(filename);
            System.out.println("Absolute path: " + file.getAbsolutePath());
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String game = line.split(": ")[1];

                // need to get rid of prefix of 'Game #'
                List<String> hands = Stream.of(game.split("; ")).map(String::new).toList();
                // now deal with hand
                boolean handIsValid = true;

                HashMap<String, Integer> powerHand = new HashMap<String, Integer>();
                for (String hand : hands) {
                    // red 20
                    List<String> colorCounts = Stream.of(hand.split(", ")).toList();
                    for (String colorCount : colorCounts) {
                        System.out.println("Hand: " + hand);
                        String color = colorCount.split(" ")[1];
                        int count = Integer.parseInt(colorCount.split(" ")[0]);

                        if(!powerHand.containsKey(color)) {
                            powerHand.put(color, count);
                        }
                        else if(powerHand.get(color) < count) {
                            powerHand.put(color, count);
                        }
                    }
                }
                int powerSum = powerHand.values().stream().reduce(1, (a, b) -> a * b);
                result += powerSum;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred for problem 2");
            e.printStackTrace();
        }


        return result;
    }

}
