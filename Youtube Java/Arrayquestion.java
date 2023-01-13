// import java.util.Scanner;
public class Arrayquestion {
    public static void main(String[] args) {
     /*    Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

         String result="";

        // for(int i=0;i<name.length();i++){
        //         if(name.charAt(i)=='e'){
        //             result = result+'i';
        //         }
        //         else{
        //             result = result+name.charAt(i);
        //         }
        // }
        // System.out.println(result);

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='@'){
                break;
            }
            else{
                result=result+name.charAt(i);
                
            }
        }
         System.out.println(result);
        sc.close(); */

        /*** To check given string is palindrome or not ***/

        String str = "abcdcba";
        for(int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start!=end){
                break;   
            } 
        }
         System.out.println(str);
    }
}
