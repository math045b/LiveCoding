import java.util.*;

public class ATM {
    public static void main(String[] args) {
        int balance = 10;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hvor meget vil du gerne hæve?");
        int withdrawelAmount = scanner.nextInt();
        
        if (withdrawelAmount > 0) {
            balance = balance - withdrawelAmount;
            System.out.println("Du har hævet " + withdrawelAmount + " kr");
            System.out.println("Du har " + balance + " kr tilbage");
        } else {
            System.out.println("Jeg ringer til politiet!");
        }
        
        
    }
}