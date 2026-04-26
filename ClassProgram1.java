// write a program using class person to declare name and age
class Person {
    public String name;
    public int age;
}

class ClassProgram1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "Suyash";
        person1.age = 20;
        person2.name = "Prapti";
        person2.age = 19;
        System.out.println("Name: " + person1.name + " Age: " + person1.age);
        System.out.println("Name: " + person2.name + " Age: " + person2.age);
    }
}