
 class  Box{
    double length;
    double width;
    double height;

        Box(double length,double width,double height){
            this.length=length;
            this.width=width;
            this.height=height;
        }

        void printinfo(){
            System.out.println("Hello I'm Akhilesh Thakur");
        }
    }

 class Boxweight extends Box{
    double weight;
       Boxweight(double length,double width,double height,double weight) {
            super(length,width,height);
            this.weight=weight;
        }
}

public class Inheritance{
    public static void main(String[] args){

        //I'm creating th eobjet.
       // Box box1 = new Box(5.5,4.4,3.3);
       // System.out.println(box1.length+" "+ box1.height+" "+box1.width);

    //    Boxweight box2 = new Boxweight(3.3, 8.3, 9.3, 9.1);
    //    System.out.println(box2.length+" "+box2.width+" "+box2.height+" "+box2.weight);

        Box  box3 = new Boxweight(2.3, 3.1, 9.2, 8.1);
        System.out.println(box3.length);  //It can be access because it in in the Box class.
      //  System.out.println(box3.weight); //It can't be access because it can't be defined in the super class


     // Boxweight obj4 = new Box(3.3,4.4,8.1,1.1); //It also can't be access because here the object is a type of parents class than how will i have call the constructor of derived class
     
    }
}
