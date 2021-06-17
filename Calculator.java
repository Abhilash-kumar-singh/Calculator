import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("Enter First number");
            float num1 = scan.nextFloat();
            System.out.println("Enter Second number");
            float num2 = scan.nextFloat();
            float result=0;
            System.out.println("Click 1 for Addition, 2 for subtraction, 3 for division, 4 for multiplication");
            int choice = scan.nextInt();
            switch(choice){
                case 1: System.out.println("You selected Addition");
                result=num1+num2;
                break;
                case 2: System.out.println("You selected Subtraction");
                result=num1-num2;
                break;
                case 3: System.out.println("You selected division");
                result=num1/num2;
                break;
                case 4: System.out.println("You selected Multiplication");
                result=num1*num2;
                break;
                default:System.out.println("God knows what you selected, start again...");
                continue;

            }
            System.out.println("Result-"+result);
            scan.nextLine();
            System.out.println("Do you wish to continue?yes/no");
            String response=scan.nextLine();
            if(response.equals("YES") || response.equals("Yes")|| response.equals("yes")) continue;
            else{
                System.out.println("Cool");
                break;
            }

        }
    }
}
