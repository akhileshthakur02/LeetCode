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
    double breadth;
        Boxweight(double length,double width,double height,double breadth){
            super(length,width,height);
            this.breadth=breadth;
        }
}
class Boxprice extends Box{
    double price;
        Boxprice(double length,double width,double height,double price){
            super(length,width,height);
            this.price=price;
        }
}
public class Hierarchial_inheritance {
    public static void main(String[] args) {
        Boxweight obj1 = new Boxweight(3.3,9.2, 2.1,8.3);
        System.out.println(obj1.width+" "+obj1.height);

        Boxprice obj2 = new Boxprice(3.2, 1.3, 9.1, 7.1);
        System.out.println(obj2.width+" "+obj2.height);
    }
}
