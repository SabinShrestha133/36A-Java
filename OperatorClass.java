public class OperatorClass {
    public static void main(String[] args) {
        //Arthematic Operators
        //+,-,*,/,%
        int intVar1 =10, intVar2 =20;
        int addOper = intVar1+intVar2; // 10+20
        int subOper = intVar1-intVar2; // 10-20
        int multOper = intVar1*intVar2; // 10*20
        int divOper = intVar1/intVar2; // 10/20
        int modOper = intVar1%intVar2; // 10/20 (remainder)

        // Assignment Operator
        int assignVar = 10;
        assignVar += 20; // 10 + 20 ->30
        assignVar -= 15; // 30 - 15 -> 15
        assignVar *=2; // 15 * 2 -> 30
        assignVar /=10; // 30 / 10 -> 3
        assignVar %=2; // 3 % 2 -> 1

        // Unary Operator
        int unaryVar = 20;
        unaryVar++; // 20 + 1 -> 21
        unaryVar--; // 21 - 1 -> 20

        // Relational Operator
        // ==, !=, >, <, >=, <=
        int relVar1 = 10, relVar2 = 20;
        boolean equalOper = relVar1 == relVar2; // 10 = 20 ? False
        boolean notEqualOper = relVar1 != relVar2; // 10 != 20
        boolean greaterOper = relVar1 > relVar2; //10>20 ? False
        boolean lesserOper = relVar1 < relVar2; // 10 < 20 ?
        boolean greaterEqualOper = relVar1 >= relVar2; // 10 >= 20

        //Logical Operator
        // &&, ||, !
        int logVar1 = 10, logVar2 = 20, logVar3 = 23;
        boolean andOper = true && true;
        boolean andOperVar = (logVar1<logVar2)&&(logVar3==logVar2); //true && false
        boolean orOper = false || false || true;
        boolean notOper = !(logVar1 < logVar2); // !true -> false
        boolean orOperVar = (logVar1<logVar2) || (logVar3==logVar2);

        // Termary Operator
        /*
         * string status;
         * int marking = 40;
         * if(marking > 40){
         *   status = "pass";
         * }else{
         * status = "fail";
         * }
         */
        int mark = 40;
        String status = (mark > 40) ? "pass" : "fail"; // ternary operator
        System.out.println("status : " + status);

        /*/*
        * Task
        * Add the following variable
        * oopMarking → int
        * architectureMarking → int
        * databaseMarking → int
        * creativeThinkingMarking → int
        * make a float avg and calculate the avg of the markings
        * make a boolean expression to check if
        * all the marking is greater or equal to 40
        * and check if the avg is greater than 50
        * Make a result - String and check the boolean
        * if true set result as “Good job” else set result as “Bad job”
        * print the result
        */

        int oopMarking = 0; // initialize variable
        int architectureMarking = 0; // initialize variable
        int databaseMarking = 0; // initialize variable
        int creativeThinkingMarking = 0; // initialize variable
    
        // assume values are assigned to these variables
        oopMarking = 60;
        architectureMarking = 70;
        databaseMarking = 80;
        creativeThinkingMarking = 90;
    
        float avg = (oopMarking + architectureMarking + databaseMarking + creativeThinkingMarking) / 4.0f;
    
        boolean isGoodJob = (oopMarking >= 40 && architectureMarking >= 40 && databaseMarking >= 40 && creativeThinkingMarking >= 40) && avg > 50;
    
        String result = isGoodJob ? "Good job" : "Bad job";
    
        System.out.println("Result: " + result);

    }
    
}
