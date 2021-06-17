import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("Enter First number");
            float num1 = scan.nextFloat();
            System.out.println("Enter Second number");
            float num2 = scan.nextFloat();
            System.out.println("Click 1 for Addition, 2 for subtraction, 3 for division, 4 for multiplication");
            int choice = scan.nextInt();
            switch(choice){
                case 1: System.out.println("You selected Addition");
                break;
                case 2: System.out.println("You selected Subtraction");
                break;
                case 3: System.out.println("You selected division");
                break;
                case 4: System.out.println("You selected Multiplication");
                break;
                default:System.out.println("God knows what you selected, start again...");
                continue;

            }
            scan.nextLine();
            System.out.println("Do you wish to continue?yes/no");
            String response=scan.nextLine();
            if(response.equals("YES") || response.equals("Yes")|| response.equals("yes")) continue;
            else break;

        }
    }
}
