import java.util.Scanner;
public class Two_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        for(int i=0; i<row; i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
            
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    System.out.println(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
