package dayOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class DayOne {

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
                if (result.isEmpty()) {g
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
