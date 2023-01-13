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
class  Boxweight extends Box{
    double breadth;
        Boxweight(double length,double width,double height,double breadth){
            super(length,width,height);
            this.breadth= breadth;
        }
}
class Boxprice extends Boxweight{
    double price;
        Boxprice(double length,double width,double height,double breadth,double price){
            super(length,width,height,breadth);
            this.price = price;
        }
}
public class Multiple_inheritance {
    public static void main(String[] args) {
        
        Boxprice box = new Boxprice(2.3,4.5,2.1,3.5,7.4);
        System.out.println(box.length+" "+box.width+" "+box.price);
    }
}
