import java.util.ArrayList;
import java.util.Collections;
public class Arraylists {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
            //Add element
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(list);

        //Get element
        int a=  list.get(1);
        System.out.println(a);


        //Add element in between
        
        list.add(1,1);
        System.out.println(list);

        //Set element
        list.set(0,5);
        System.out.println(list);
        //Remove element
        list.remove(3);
        System.out.println(list);
        //Size of element
       int size= list.size();
        System.out.println(size);

        //Sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}
