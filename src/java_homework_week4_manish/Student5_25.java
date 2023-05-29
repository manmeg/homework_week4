package java_homework_week4_manish;

/**
 *25. Example of Constructor Overloading
 */
//Java program to overload constructors


class Student5_25 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5_25(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Student5_25(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student5_25 s1 = new Student5_25(111, "Karan");
        Student5_25 s2 = new Student5_25(222, "Aryan", 25);
        s1.display();
        s2.display();
    }

}