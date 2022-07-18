
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> inputs = new ArrayList<>();
        
        
        while (true){
            String row = scanner.nextLine();
            if (row.equals("")){
                break;
            }
            
            inputs.add(row);
        }
        
        String combined = inputs.stream().reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(combined);

    }
}
