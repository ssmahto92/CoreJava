package com.java.features.java14;

public class SwitchExpression {

    public static void main(String[] args) {

        System.out.println(findTheDayOfTheWeek(2));
        System.out.println(findTheDayOfTheWeekUsingSwitchInJava14(0));
        System.out.println(effectiveDay("SUNDAY"));
    }

    public static String findTheDayOfTheWeek(int day) {

        String dayName;

        switch (day) {
           case 0:  dayName = "Sunday"; break;
           case 1:  dayName = "Monday"; break;
           case 2:  dayName = "Tuesday"; break;
           case 3:  dayName = "Wednesday"; break;
           case 4:  dayName = "Thursday"; break;
           case 5:  dayName = "Friday"; break;
           case 6:  dayName = "Saturday"; break;
           default: throw new IllegalArgumentException("Invalid Option " + day);
        }

        return dayName;
    }

    public static String findTheDayOfTheWeekUsingSwitchInJava14(int day) {

        var dayName = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> throw new IllegalArgumentException("Invalid Option " + day);
        };

        var dayName1 = switch (day) {
            case 0 -> {
                System.out.println("complex logic");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 3 -> "Tuesday";
            default -> throw new IllegalArgumentException("invalid input !!");
        };

        return dayName;
    }

    static  String effectiveDay(String Day) {

        return switch (Day) {
            case  "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Working Day";
            case "Saturday", "Sunday" -> "Non Working Day";
            default -> throw new IllegalArgumentException("Invalid Input");
        };
    }
}
