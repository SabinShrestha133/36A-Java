public class IfStatement {

    public static void main(String[] args) {
        // If Statement, decision making
        int num1 = 10;
        if (num1 > 10) {
            System.out.println("greater than 10");
            // more statement
        }
        // If - else statement
        if (num1 > 20) {
            System.out.println("greater than 20");
        } else {
            System.out.println("less than 20");
        }

        // if - else - if
        if (num1 == 10) {
            System.out.println("Num is 10");
        } else if (num1 == 9) {
            System.out.println("Num is 9");
        } else {
            System.out.println("Num is unknown");
        }

        // if - else - if ladder // multiple else if
        String bevarage = "Coke";
        if (bevarage == "Fanta") {
            System.out.println("Orange Drink");
        } else if (bevarage == "Coke") {
            System.out.println("Black drink");
        } else if (bevarage == "Sprite") {
            System.out.println("Clear Drink");
        } else {
            System.out.println("Unknown Drink");
        }

        // Nested if
        if (bevarage == "Coke") {
            if (num1 == 10) {
                System.out.println("Coke and 10");
            } else {
                System.out.println("Only Coke");
            }
        } else {
            if (num1 == 10) {
                System.out.println("Only 10");
            } else {
                System.out.println("No coke and 10");
            }
        }
        // Task 1
        // make a varaible int day and assign value
        // if day is 1 -> print Sunday
        // if day is 2 -> print Monday
        // if day is 3 -> print Tuesday
        // if day is 4 -> print Wednesday
        // if day is 5 -> print Thursday
        // if day is 6 -> print Friday
        // if day is 7 -> print Saturday
        // if fay is not in number -> print Unknown Day

        // Task 2
        // Make a variable avgMark abd a char variable gender
        // if avgMark is greater than 80 and gender is 'M' print "Good boy"
        // if avgMark is greater than 80 and gender is 'F' print "Good Girl"
        // if avgMatk is not greater than 80 and gender is 'M' print "Bad Boy"
        // if avgMatk is not greater than 80 and gender is 'F' print "Bad Girl"

        int day = 1;
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Unknown Day");
        }

        int avgMark = 80;
        String Gender = "M";
        if (avgMark < 80) {
            if (Gender == "M") {
                System.out.println("Good Boy");
            } else if (Gender == "F") {
                System.out.println("Good Girl");
            }
        } else {
            if (Gender == "F") {
                System.out.println("Bad Girl");
            } else if (Gender == "M"){
                System.out.println("Bad Boy");
            }
        }
    }
}
