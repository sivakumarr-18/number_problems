class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student("Siva", 20);

        s.display();
    }
}