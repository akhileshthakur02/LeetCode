class Student{      //Class
    int roll;
    String name;
    float marks;

    Student(){       //Constructor
        this.roll=23;
        this.name = "Akhilesh Thakur";
        this.marks = 87.2f;
    }
}
public class class_objects_constructor {
    public static void main(String[] args) {
        Student stud1 = new Student();         //Objects
        Student stud2 = new Student();         //We are creating so many objects.
        // System.out.println(stud2.marks);
        System.out.println(stud1.roll);
        System.out.println(stud1.name);
        System.out.println(stud1.marks);
    }
}
