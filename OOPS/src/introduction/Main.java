package introduction;

public class Main {
    public static void main() {
        // store 5 roll_no
        int [] numbers =new int[5];

        // store 5 names
        String [] names = new String[5];

        // data of 5 students : {roll no, name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        /* We cant store data of these students like this it will be diffcult to identify
          which student is having which roll no and marks
          so to solve this problem we use OOPS(Object Oriented Programming System)
          in OOPS we create a blueprint of student which will have all the properties of student
          and then we create objects of that blueprint for each student
         */

        Student student1; // created a reference variable of Student class like we use int a, String s
        student1 = new Student(); // created an object of Student class and assigned it to reference

        // We can do these task in single line also
        // Syntax- ClassName objectName = new ClassName();
        Student student2 = new Student(); // created object of Student class
        /*
        A Closer Look at new:
        classname class-var = new classname ( );
        Here, class-var is a variable of the class type being created. The classname is the name of the class that is being
                instantiated. The class name followed by parentheses specifies the constructor for the class. A constructor defines
        what occurs when an object of a class is created.
        */

        // now we can set values to the properties of student1 and student2

        student1.roll_no = 1;
        student1.name = "Yash";
        student1.marks = 95.5f;

        // accessing the values
        System.out.println(student1.roll_no);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        // can we able to change the values of student1
        student1.marks = 99.9f; // yes we can change the values
        System.out.println("Updated marks of student1: " + student1.marks);

        // I can do the same task using methods also
        // for that we need to create methods in Student class
        student1.changeName("Suraj");
        // argument - "Suraj" is passed to the method changeName

        Student student3 = student1;
        student3.name = "Kunal";
        System.out.println(student1.name);// it will print Kunal because both student1 and student3 are pointing to same object in heap memory

        //Student student4 = new Student();
        // Student() - its looking something like method call but its not a method its a constructor
        // Constructor - special type of method which is used to initialize the object
        // what does it mean??

        /*
        student4.name = "Rohit";
        student4.roll_no = 4;
        student4.marks = 88.8f;
        Writing this code again and again for every new student is a tedious task
        so to solve this problem we use constructor
        */

        Student student4 = new Student(); // default constructor is called here
        /* when we create object of Student class constructor is called automatically
        *  So we define the constructor inside the class
        *  Syntax:
        *  class ClassName {
        *       // constructor
        *       ClassName() {
        *           // initialization code
        *       }
        * */

        // How to initialize the object using constructor for that we make parameterized constructor

        Student student5 = new Student("Rohit", 5, 78.8f); // parameterized constructor is called here
        System.out.println("Student5 name: " + student5.name);
        System.out.println("Student5 roll no: " + student5.roll_no);


    }

}
// Blueprint of Student
class Student {
    int roll_no;
    String name;
    float marks;
    
    // Method to change name
    // parameter - newName
    void changeName(String newName) {
        name = newName;
    }

    Student(){
        System.out.println("I am in default constructor");
    }

    /*
    Student(String n, int rno, float m){
        name = n;
        roll_no = rno;
        marks = m;
    }
    */

    // But here there is a problem what if paramter also have same name as class properties
    // like this
    /* Student(String name, int roll_no, float marks){
        name = name; // this will not work as expected
        roll_no = roll_no;
        marks = marks;
    } */
    // To solve this problem we use this keyword
    Student(String name, int roll_no, float marks){
        this.name = name; // this.name refers to class property and name refers to parameter
        this.roll_no = roll_no;
        this.marks = marks;
    }

}
