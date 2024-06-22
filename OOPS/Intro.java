package OOPS;
class Intro{
    public static void main(String[]args){
        int a = 10;
        System.out.println("");
        Student s1 = new Student(11,"Yash",21);
        // s1.rno = 11;
        // s1.name = "Yash";
        // s1.age = 21;
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}

class Student {
    int rno;
    String name;
    int age;

    void Greeting(){
        System.out.println("Hello! My name is "+name);
     }
    Student(int rno,String name,int age){
        this.rno = rno;
        this.name = name;
        this.age = age;
        Greeting();
    }
}