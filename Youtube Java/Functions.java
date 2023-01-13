/*import java.util.Scanner;
public class Functions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        sc.close(); 
        int sum = a+b;
        System.out.println(sum);
        }
    public static int add(int a,int b){
        int add = a+b;
        System.out.println(add);
       return add;
        
    }
} */
/*import java.util.Scanner;
public class Functions{
    public static void main(String[] args) {
        int ans= add();
        System.out.println(ans);
    } 
        public static void add(){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            sc.close();
            //System.out.println(sum);
             return sum;
           
        }
    }  */

/*import java.util.Scanner;
public class Functions{
public static void main(String[] args){
    int ans=add(20,30);
    System.out.println(ans);

}
public static int add(int a,int b) {
    int sum = a+b;
    return sum;
}
  } */

  import java.util.Scanner;
  public class Functions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int ans= add(a,b);
       System.out.println(ans);
    }
    public static int add(int a ,int b){
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        int sum = a+b;
        return sum;
    }
  }

