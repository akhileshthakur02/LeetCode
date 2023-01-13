class Shapes{
    void area(){
        System.out.println("I'm in Shapes class");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("I'm in Square class");
    }
}
class Cube extends Shapes{
    void area(){
        System.out.println("I'm in Cube class");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Shapes obj1 = new Shapes();
        Square obj2 = new Square();
        Cube obj3 = new Cube();

        obj1.area();
        obj2.area();
        obj3.area();
    }
}
