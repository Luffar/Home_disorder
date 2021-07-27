public class Compare1 {
    public static void main(String[] args) {

        Person person = new Person("Domestos", 20, 300,"Dimidroll");
        Person person1 = new Person("Dementor",99, 150, "Potter");
        Person person2 = new Person("Dementor", 74, 300.300, "Dumblchuck");
        Person person3 = new Person("Domestos", 55, 300, "Utenok");

        System.out.println(person.equals(person3));
    }
}
class Person {
    private String name;
    private int age;
    private double salary;
    private String surName;

        public Person(String name, int age, double salary, String surName) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.surName = surName;
        }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
            if (!(obj instanceof Person)) return false;

            Person person = (Person)obj;
        return this.name.equals(person.name)
            & this.age == person.age
            & this.surName == person.surName
            & this.salary == person.salary;

    }

}
