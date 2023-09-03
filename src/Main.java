public class Main {
    public static void main(String[] args) {

// Task 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст равен 18 или больше, то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст совершеннолетия еще не наступил, то нужно немного подождать");
        }

// Task 2
        int t = 3;
        if (t < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

// Task 3
        int speed = 90;
        if (speed > 60) {
            System.out.println("Если скорость превышает 60 км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость не привышает 60 км/ч, можно ездить спокойно");
        }

// Task 4
        int ageHuman = 8;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст от 2 до 6, то нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст от 7 до 17, то нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст от 18 до 24, то нужно ходить в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст больше 24, то нужно ходить на работу");
        } else {
            if (ageHuman < 2) {
                System.out.println("");
            }
        }

// Task 5
        int ageKid = 5;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка до 5 лет, то ему нельзя кататься на атракционе");
        }
        if (ageKid >= 5 && ageKid < 14) {
            System.out.println("Если возраст ребенка от 5 до 14 лет, то ему можно кататься на атракционе в сопровождении взрослого");
        } else {
            if (ageKid >= 14) {
                System.out.println("Если возраст ребенка от 14 лет, то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
// Task 6
        int occupeSittPlace = 52;
        int occupeStandPlace = 42;

        int totalSeats = 102;
        int sittPlace = 60;
        int standPlace = (totalSeats - sittPlace);

        int freeSeatt = sittPlace - occupeSittPlace;
        int freeStand = standPlace - occupeStandPlace;

        if (occupeSittPlace < sittPlace || occupeStandPlace < standPlace) {
            System.out.println("В вагоне есть свободные места: сидячих - " + freeSeatt + " , стоячих - " + freeStand);
        } else {
            System.out.println("Свободных мест нет");
        }

// Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            if (three > one && three > two) {
                System.out.println("Число " + three + " больше остальных");
            }
        }

    }
}