public class UserOutput {
    public static void main(String[] args) {
        // standard output/ terminal output
        // continuos printing
        System.out.println("This");
        System.out.println("is");
        System.out.println("java\n");

        // line break after printing
        System.out.println("Next print will start from next line");

        // Print using formatting
        // %f floating point, %integeal, %String(any)
        System.out.printf("Temperature %f degree celcius", 30.22);
        // can use multiple placeholder
        System.out.printf("Name %s, Age %d, Weight %f", "Mero nam", 30, 75.44);
        // the arrangement of the placeholder andvalue given after string must match
        // eg: 1 %s String, 2 %d integer, 3 %f float

    }
}
