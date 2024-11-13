public class SwitchCaseStatement {
    public static void main(String[] args) {
        int day = 3;
        switch (day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }

        String bevarage = "coke";
        char gender = 'M';
        switch (bevarage){
            case "coke":
                switch (gender) {
                    case 'M':
                        System.out.println("Male");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;
                }
                System.out.println("Black");
            default:
                System.out.println("Unknown Bevrage");
                break;
        }

        int status = 404;
        switch(status){
            case 200:
            case 201:
            case 202:
                System.out.println("success");
                break;
            case 401:
            case 404:
                System.out.println("Not found");
                break;
            default:
                 System.out.println("Unknown status");
                 break;
        }
    }
}
