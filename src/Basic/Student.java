package Basic;

class Student {

    String name;
    int age;
    long phone;

    Student(String n, int a, long p) {
        name = n;
        age = a;
        phone = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Iyal", 21, 987654321);
        Student s2 = new Student("yazhnick", 22, 987643210);
        Student s3 = new Student("Isai", 23, 987654210);

        s1.display();
        s2.display();
        s3.display();



    }
}