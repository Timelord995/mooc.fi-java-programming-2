
public class Program {

    public static void main(String[] args) {
        // Test your method here
        
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
        
        System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] x: array){
            for (int y: x){
                stringBuilder.append(y);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
