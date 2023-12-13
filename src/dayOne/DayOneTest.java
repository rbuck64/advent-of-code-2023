package dayOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {
    @Test
    void testTest() {
        DayOne dayOne = new DayOne();
        assertEquals(dayOne.test(), "Hello, World!");
    }

    @Test
    void getIntFromLine() {
        DayOne dayOne = new DayOne();
        String str1 = "adfljahsf1lakflfakj3";
        String str2 = "adfljahsf14kflfakj";
        String str3 = "2adfljah23456788flakflfakj3";

        assertEquals(dayOne.getIntFromLine(str1), 13);
        assertEquals(dayOne.getIntFromLine(str2), 14);
        assertEquals(dayOne.getIntFromLine(str3), 23);
    }

    @Test
    void IntFromLineAsStringPtTwo() {
        DayOne dayOne = new DayOne();
        String str1 = "one";
        String str2 = "twothreefour";
        String str3 = "eighthree";

        assertEquals(dayOne.getIntFromLinePtTwo(str1), 11);
        assertEquals(dayOne.getIntFromLinePtTwo(str2), 24);
        assertEquals(dayOne.getIntFromLinePtTwo(str3), 83);
    }
}