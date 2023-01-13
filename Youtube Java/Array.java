        /***Take an array of names as input from the user and print them on the screen.
***/
/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();

    String[] names = new String[size];

    for(int i=0;i<size;i++){
        names[i]=sc.nextLine();
    }
    for(int i=0;i<size;i++){
        System.out.println(names[i]);
    }
    sc.close();
    }
} */

        /*** Find the maximum & minimum number in an array of integers. 
  ***/

  import java.util.Scanner;
  public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Largest number is:"+max);
        System.out.println("Smallest number is:"+min);
        sc.close();
    }
  }
    