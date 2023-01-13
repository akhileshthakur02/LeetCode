    /***Print wheteher a number is even or odd */

// import java.util.Scanner;
public class Practice_Question_kk {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
       System.out.println("Enter yoyr number");
       int a=input.nextInt();
       String ans="";
       if(a%2==0){
        ans="Number is even ";
       }
       else{
        ans="Number is odd ";
       }
       System.out.println(ans);
       input.close();
    }
} */
            /***Program to print Name and some message */
   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name");
    String name=sc.nextLine();

    System.out.println("Hey how are you "+name);
    sc.close(); */


    /****Program to find Simple interest ***/
   /*  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the principle");
    int p=sc.nextInt();
    System.out.println("Enter the rate");
    int r=sc.nextInt();
    System.out.println("Enter the time");
    int t=sc.nextInt();

    int simpleInterest = p*r*t/100;
    System.out.println("Total intesret :"+simpleInterest);
    sc.close(); */

    /****Take two number and operate operartions */
   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter th eoperators: +,-,*,/");
    String operator=sc.nextLine();
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    if(operator.equals("+")){
       System.out.println("Addition is"+(a+b));
    }
    if(operator.equals("-")){
        System.out.println("Subtraction is"+(a-b));
    }
    if(operator.equals("*")){
        System.out.println("Multiplication is"+(a*b));
    }
    if(operator.equals("/")){
        System.out.println("Division is"+(a/b));
    }
    sc.close(); */

    /*** Program to find largets number ***/
   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the firts number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    String ans="";
    if(a>b){
        ans = "Largest number";
    }
    else{
        ans = "Smallest number";
    }
    System.out.println(ans);
    sc.close(); */

    /*** Input currency in rupees and output in USD ***/
   /*  Scanner sc =new Scanner(System.in);
    System.out.println("Enter the rupees");
    float rupees = sc.nextFloat();

    float dollar = rupees/64;
    System.out.println(dollar+" Dollar");
    sc.close(); */

    /*** Input a year and find whether it is a leap year or not ***/

    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    String ans="";
     if(year%400==0){
        ans = "Year is a leap year";
    }
    else if(year%100==0){
        ans = "Year is not a leap year";
    }
    else if(year%4==0){
        ans = "Year is a leap year";
    }
    else{
        ans = "Year is not a leap year";
    }
    System.out.println(ans);
    sc.close(); */

   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the table ");
    int a = sc.nextInt();
    int i=1;
    while(i<=10){
       System.out.println("Multiplication table :"+a*i);
         i++;
    }
    
    sc.close(); */

   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    System.out.println("Enter the second number");
    int b = sc.nextInt();
    System.out.println("Enter the third number");
    int c = sc.nextInt();
   /* String ans="";
     if(a>=b && a>=c){
        ans = "A is largets :";
    }
    else if(b>=a && b>=c){
        ans = "B is largest";
    }
    else{
        ans = "C is largest";
    }
    System.out.println(ans);
    sc.close(); */

        //OR

   /*  int max=a;
    if(b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }
    System.out.println("Maximum number is "+max);
    sc.close(); */

   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the charachter");
    char ch = sc.next().charAt(0);

    if(ch>='a' && ch<='z'){
        System.out.println("Lower Case");
    }
    else{
        System.out.println("Upeer Case");
    }
    sc.close(); */
    /*** Fibonnaci series ***/
   /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();

    int a=0;
    int b=1;
     System.out.println(a);
     System.out.println(b);
    for(int i=1;i<=n;i++){

       
           int temp=a+b;
           System.out.println(temp);
           a=b;
           b=temp;

    }
    sc.close();  */

    int num=3234445;
    int rev=0;

    while(num!=0){
        int rem = num%10;
        rev = rev*10+rem;
        num = num/10;
    }
    System.out.println(rev);
    }
}

