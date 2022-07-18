



import java.util.Random;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers shoudl be printed? ");
        Random ladyLuck = new Random();
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < number; i++){
            System.out.println(ladyLuck.nextInt(11));
        }
    }

}
