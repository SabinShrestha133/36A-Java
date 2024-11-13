public class UserInputUsingArgs{
    public static void main(String[] args) {
        // The parameter string[] args takes array of input
        //when running from command line
        // You can compile java file with
        //javac FileName.java
        //java FileName args1 args2
        // or
        // java FileName.java args1 args2
        System.out.println("First Args " +args[0]);
        System.out.println("Second Args " +args[1]);
        
        // The args are in datatype string to convert or prase any args
        int argsPrase1 = Integer.parseInt(args[0]);
        int argsPrase2 = Integer.parseInt(args[1]);
        System.out.println("Sum of args "+ (argsPrase1+argsPrase2));
    }
}
