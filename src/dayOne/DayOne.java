package dayOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class DayOne {

    public int sumIntsFromFilePtTwo(String filename) {
        int result = 0;
        try {
            File file = new File(filename);
            System.out.println("Absolute path: " + file.getAbsolutePath());
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result += getIntFromLinePtTwo(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return result;
    }

    String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public int getIntFromLinePtTwo(String str) {
        StringBuilder result = new StringBuilder(2);

        for (int i = 0; i < str.length(); i++) {
            char newChar = str.charAt(i);
            if (isDigit(newChar)) {
                if (result.isEmpty()) {
                    result.append(newChar);
                    result.append(newChar);
                }
                result.deleteCharAt(1);
                result.append(newChar);
            } else {
                for(int j = 0; j < 10; j++) {
                    if(str.startsWith(nums[j], i)) {
                        if (result.isEmpty()) {
                            result.append(String.valueOf(j));
                            result.append(String.valueOf(j));
                        }
                        result.deleteCharAt(1);
                        result.append(String.valueOf(j));
                    }
                }
            }
        }
        return Integer.parseInt(String.valueOf(result));
    }


    public int sumIntsFromFile(String filename) {
        int result = 0;
        try {
            File file = new File(filename);
            System.out.println("Absolute path: " + file.getAbsolutePath());
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result += getIntFromLine(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return result;
    }
    public int getIntFromLine(String str) {
        StringBuilder result = new StringBuilder(2);

        for (int i = 0; i < str.length(); i++) {
            char newChar = str.charAt(i);
            if (isDigit(newChar)) {
                if (result.isEmpty()) {
                    result.append(newChar);
                    result.append(newChar);
                }
                result.deleteCharAt(1);
                result.append(newChar);
            }
        }
        return Integer.parseInt(String.valueOf(result));
    }

    public static String test() {
        return "Hello, World!";
    }
}
