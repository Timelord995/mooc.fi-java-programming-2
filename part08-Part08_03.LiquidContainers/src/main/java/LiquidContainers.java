
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int amountFirst = 0;
        int amountSec = 0;
        
        while (true) {
            System.out.println("First: " + amountFirst + "/100");
            System.out.println("Second: " + amountSec + "/100" );

            String input = scan.nextLine();
            
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                if (amount <= 0){
                    continue;
                }
                
                amountFirst += amount;
                
                if(amountFirst > 100){
                        amountFirst = 100;
                }
            }
            
            if (command.equals("move")){
                if (amount <= 0){
                    continue;
                }
                
                if (amountFirst < amount){
                    amountSec += amountFirst;
                    amountFirst = 0;
                }
                
                if (amountFirst >= amount){
                    amountFirst -= amount;
                    amountSec += amount;
                }
                
                if (amountSec > 100){
                    amountSec = 100;
                }
            }
            
            if (command.equals("remove")){
                if (amount <= 0){
                    continue;
                }
                
                amountSec -= amount;
                
                if (amountSec < 0){
                    amountSec = 0;
                }
            }
            
            System.out.println("");

        }
    }

}
