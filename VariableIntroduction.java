public class VariableIntroduction {

    public static void main(String[] args) {
        //shortcut psvm
        //Primitive datatype
        //Declaration
        boolean boolVariable;
        //Initialization
        boolVariable = false;
        //Declaration and Initialization
        int intVariable = 10;
        //Multi declaration
        float floatVariable1, floatVariable2;
        //Initialization
        floatVariable1 = 10.33f;
        //Multi Declaration and Initialization
        char charVariable1 = 'c', charVariable2 = 'a', charVariable3 = 't';
        //Limitation
        // byte byteVariable = 100000000000; cannot exceed the capacity
        // short shortVariable = false; cannot missmatch type of value
        
        //Non primitive Datatype
        String stringVariable = "Hello World";
        //String value is enclosed in double quotes ""
        //Can make string using constructor
        String stringVariable = new String("object of string");

        /*Task
         * Declare the following variable
         * firstName String
         * lastName String
         * age int
         * over18 boolean
         * initialize each variable with your own detail
         * declare multiple variable
         * mathMarking, englishMarking, scienceMarking -> float
         *Initialize each variable with decimal number 
         *Declare and initialize multiple variable
         * avarageMarking, gpa -> double
         */

        // Task
        String firstName = "Sabin";
        String lastName = "Shrestha";
        int age = 20;
        boolean over18 = true;
        
        float mathMarking = 85.5f;
        float englishMarking = 92.0f;
        float scienceMarking = 78.2f;
        
        double averageMarking = (mathMarking + englishMarking + scienceMarking) / 3;
        double gpa = 3.7;


    }    
}