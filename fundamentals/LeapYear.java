package bites.examples;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public ArrayList<Integer> leapYearsBetween(Integer start_year, Integer end_year) {
        ArrayList<Integer> lyb = new ArrayList<>();
        for (int x = start_year; x <= end_year; x++) {
            if (isLeapYear(x)) {
                lyb.add(x);
            }
        }
        return lyb;
    }

    public Integer closestLeapYearTo(Integer year) {
        return leapYearsBetween(year - 2, year + 2).getFirst();
    }

    public static void main(String[] args) {
        LeapYear lY = new LeapYear();
        System.out.println(lY.isLeapYear(2000)); // t
        System.out.println(lY.isLeapYear(1970)); // f
        System.out.println(lY.isLeapYear(1900)); // f
        System.out.println(lY.isLeapYear(1988)); // t
        System.out.println(lY.isLeapYear(1500)); // f

        System.out.println(lY.leapYearsBetween(1999, 2001)); // 2000

        System.out.println(lY.closestLeapYearTo(1999)); // 2000
        System.out.println(lY.closestLeapYearTo(2001)); // 2000
    }
}
