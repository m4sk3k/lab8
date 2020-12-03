class People{
    protected String name;
    protected String lastname;
    protected int age;

    People(){
        name = "default_name";
        lastname = "default_lastname";
        age = 0;
    }

    People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    void walk(){
        System.out.println(name + " - гуляет по улице");
    }

    void voice(){
        System.out.println(name + " - говорит сам с собой");
    }

    void run(){
        System.out.println(name + " - бежит от кого-то");
    }

    static class Student extends People{
        public Student(String name, String lastname, int age){
            super(name, lastname, age);
        }
        void learn(){
            System.out.println(name +" - спит на лекции");
        }
    }

    static class Teacher extends People{
        public Teacher(String name, String lastname, int age){
            super(name, lastname, age);
        }
        void teach(){
            System.out.println(name + " " + lastname +" - ведет лекцию");
        }
    }
}

public class Lab8 {
    public static void main(String[] args) {
        System.out.println("Стандартный конструктор:");
        People people = new People();
        System.out.println(people.name + "\n" + people.lastname + "\n" + people.age);
        System.out.println("\nПараметризированный конструктор:");
        People people2 = new People("Василий","Пупкин", 19);
        System.out.println(people2.name + "\n" + people2.lastname + "\n" + people2.age);
        people2.walk();
        people2.voice();
        people2.run();
        System.out.println();
        People.Teacher kolya = new People.Teacher("Николай", "Егоров", 19);
        kolya.teach();
        System.out.println();
        People.Student max = new People.Student("Максим", "Макаров", 19);
        max.learn();
        max.voice();
    }

}