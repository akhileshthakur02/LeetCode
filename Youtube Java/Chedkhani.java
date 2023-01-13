/*class Box{
    double length;
    double width;
    double height;

        Box(){
            this.length=-1;
            this.width=-2;
            this.height=-3;
        }
}
class Boxweight extends Box{
    double breadth;
        Boxweight(){
            super();
            this.breadth=-4;
        }
}
class Boxprice extends Boxweight{
    double price;
     Boxprice(){
        super();
        this.price = -5;
     }
}
public class Chedkhani {
    public static void main(String[] args) {
        
        // Boxprice box = new Boxprice();
        // System.out.println(box.price);

        Boxweight box1 = new Boxprice();
        System.out.println(box1.length);
    }
}  */

/*class Box{
    double length;
    double breadth;
        Box(){
            this.length=-2;
            this.breadth=-1;
        }
}
class Boxweight extends Box{
    double width;
        Boxweight(double width){
            super();
            this.width=width;
        }
}
class Boxprice extends Boxweight{
    double height;
    Boxprice(double width,double height){
        super(width);
        this.height=height;
    }
}

public class Chedkhani{
    public static void main(String[] args) {
        // Boxprice obj = new Boxprice(3.2, 9.2);
        // System.out.println(obj.width);

        Box obj1 =new Boxweight(3.2);
        System.out.println(obj1.breadth);
    }
} */

class Box{
    double length;
    double width;
    double height;
        Box(double length,double width,double height){
            this.length=length;
            this.width=width;
            this.height=height;
        }
}

class Boxweight extends Box{
    Double length;
    Double width;
    Double height;
        Boxweight(double length,double width,double height){
            super(length,width,height);
            this.length=length;
            this.width=width;
            this.height=height;
        }
}

public class Chedkhani{
    public static void main(String[] args) {
        // Box obj = new Boxweight(2.3,5.3,1.2);
        // System.out.println(obj.height);

      //  Boxweight obj1 = new Box(3.2,1.3,5,4);  Here error is generated.
        Boxweight obj3 = new Boxweight(2.1, 4.3, 8.1);
        System.out.println(obj3.width);
        System.out.println(obj3.length);
    }
}