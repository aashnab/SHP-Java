import java.util.Scanner;
public class Cashier {
    
    public static void main(String []args) {
        boolean runAgain = true;
        Scanner s = new Scanner(System.in);
        while (runAgain) {
            run();
            System.out.println("Do you want to continue? (Y/N)");
            String goAgain = s.nextLine();
            if (goAgain.equals("N")) {
                runAgain = false;
            }
            
        }
    }
    
    public static void run() {
        System.out.print ("Amount Due");
        Scanner s = new Scanner(System.in);
        int due = s.nextInt();
        s.nextLine();
        System.out.print ("Amount Recieved");
        int recieved = s.nextInt();
        s.nextLine();
        int change = (recieved - due);
        System.out.println(change(change));
    }
    
    public static String change(int change) {
        int dollars = (change/100);
        int remainingchange = (change % 100);
        int quarters = (remainingchange/25);
        int remainingchange2 = (remainingchange % 25);
        int dimes = (remainingchange2/10);
        int remainingchange3 = (remainingchange2 % 10);
        int nickles = (remainingchange3/5);
        int pennies = (remainingchange3 % 5);
        return (dollars+ " dollars " +quarters+ " quarters " +dimes+ " dimes " +nickles+ " nickles, and " +pennies+ " pennies.");
        
        
    }
    
}