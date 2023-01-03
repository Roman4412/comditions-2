public class Main {
    public static void main(String[] args) {
        // 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("***********************");
        // 2
        int airTemperature = 9;
        if (airTemperature <= 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("***********************");
        // 3
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        System.out.println("***********************");
        // 4
        int ageSecond = 12;
        if (ageSecond >= 2 && ageSecond <= 6) {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему нужно ходить в детский сад");
        } else if (ageSecond >= 7 && ageSecond <= 18) {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему нужно ходить в школу");
        } else if (ageSecond > 18 && ageSecond <= 24) {
            System.out.println("Если возраст человека равен " + ageSecond + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему пора ходить на работу");
        }
        System.out.println("***********************");
        // 5
        int childAge = 13;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println("***********************");


        // 6
        int occupiedSeatPlace = 60;
        int occupiedStandingPlace = 41;
        int totalCapacity = 102;
        int seat = 60;
        int standingPlace = totalCapacity - seat;
        if (occupiedSeatPlace + occupiedStandingPlace < totalCapacity) {
            if (occupiedSeatPlace < seat && occupiedStandingPlace < standingPlace) {
                System.out.println("Есть сидячие и стоячие места");
            } else if (occupiedSeatPlace < seat) {
                System.out.println("Есть только сидячие места");
            } else {
                System.out.println("Есть только стоячие места");
            }
        }
        else {
            System.out.println("Свободных мест нет");
        }

        System.out.println("***********************");

        // 7
        int one = 123;
        int two = 13;
        int three = 125;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else if (three > one) {
            System.out.println(three);
        }
    }
}