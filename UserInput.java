import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //To take input import Scanner class at the top of the files
        // import java.util.scanner;
        //Make an object of the scanner and take input from object
        Scanner scan = new Scanner(System.in);
        System.out.println("Your age: ");
        int ageInput = scan.nextInt();
        System.out.println("Your age is: " + ageInput);

        System.out.println("OVer 18");
        boolean over18Input = scan.nextBoolean();

        System.out.println("Your weight: ");
        double weightInput = scan.nextDouble();

        //After using Scanner for primitive data and want input for String
        //you need to clear the enter input
        scan.nextLine();
        System.out.println("Your name: ");
        String name = scan.nextLine();
        scan.close(); //must close scanner object to avoid imput locks
    }
}
