package Task1;

import enums.Gender;
import exsample.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----WEEK-----");
        System.out.println(Days.MONDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);
        System.out.println(Days.SUNDAY);

        System.out.println("---Second Variant:---");
        for (Days value : Days.values()) {
            System.out.println(value);
        }
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("\nWrite number days: ");
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1 -> {System.out.println(Days.MONDAY);
                    Days.MONDAY.lessonsInWeek();}
                case 2 -> {
                    System.out.println(Days.TUESDAY);
                    Days.TUESDAY.lessonsInWeek();}
                case 3 -> {
                    System.out.println(Days.WEDNESDAY);
                    Days.WEDNESDAY.lessonsInWeek();
                }
                case 4 -> {
                    System.out.println(Days.THURSDAY);
                    Days.THURSDAY.lessonsInWeek();
                }
                case 5 -> {
                    System.out.println(Days.FRIDAY);
                    Days.FRIDAY.lessonsInWeek();
                }
                case 6 -> {
                    System.out.println(Days.SATURDAY);
                    Days.SATURDAY.lessonsInWeek();
                }
                case 7 -> {
                    System.out.println(Days.SUNDAY);
                    Days.SUNDAY.lessonsInWeek();
                }
                default -> {
                    isTrue = false;
                }
            }
            Person pr = new Person();
            pr.setName(new Scanner(System.in).nextLine());
            pr.setGender(Gender.valueOf(new Scanner(System.in).nextLine()));

            System.out.println(pr.getName());
            System.out.println(pr.getGender());
        }
    }
}
