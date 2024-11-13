public class VariableExample {
    //Instance Variable
    int instanceVariable = 100;
    //instanceaVariable can only be accessed with the object
    //Static Vairable
    static boolean staticVariable = false;
    //staticVariable can be accessed with Class directly
    void firstFunction(){
        int localVariable =300;
        //Local variable are made inside a function/constructer scope/block
        System.out.println("Local Variable : " + localVariable);
    }
    public static void main(String[] args) {
        int localVariable2 = 400;
        System.out.println("Local variable : " + localVariable2);
        //To use the instance variable of a class, make object
        //Syntax: ClassName objVariable = new ClassName();
        VariableExample variableExampleObj = new VariableExample();
        //the variable of VariableExample is called object, here variableExamppleObj
        System.out.println("Instance Variable : " + variableExampleObj.instanceVariable);
        //Static variable can be accessed with, ClassName.variable
        System.out.println("Static Variable : " + VariableExample.staticVariable);

        //Java TypeCasting Primitive Datatype
        //Widening Casting/Implicit Casting/ automatic
        //Conversion of smaller datatype to larger datatype (size/capacity)
        //byte -> short -> int -> long -> float -> double
        byte byteVariable = 10;
        short shortVariable = byteVariable; // here byte is automatically converted to short

        int mathMark =20;
        double mathConverted = mathMark; //int is automatically converted to double -> 20.0
        System.out.println("Int to double " + mathConverted);

        //Narrowing Casting/Explicit Casting/Manual
        //Conversion of larger datatype to smaller datatype (size/capacity)
        double gpa = 3.4;
        int gpaInt = (int) gpa;
        System.out.println("GPA int " + gpaInt);
        int floatConversion = (int) 400.33f; // 400
        /*
         * Task
         * Make an instance variable firstName
         * Make a new ibject and print the firstName
         * Calculate and print the following
         * double avg =13/2
         * float pct =  411/100
         */
    }
}
