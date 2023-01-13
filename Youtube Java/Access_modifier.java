class A{
    protected String name;
//    public void getNum(){
//         System.out.println(name);
//     }
//    public void setNum(String name){
//         this.name=name;
//     }

        A(String name){
            this.name=name;
        }
}
// class B extends A{
//     B(String name){
//         super(name);
//     }
// }
public class Access_modifier {
    public static void main(String[] args) {
         A obj = new A("Akki ");
        System.out.println(obj.name);

// B obj1 = new B("JJJ");
// System.out.println(obj1.name);

    }
}
