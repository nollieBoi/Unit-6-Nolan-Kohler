public class Person{
    private String name;
    private int age;
    public Person(int a, String n){
        age = a;
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Name: " + name + "\n" + "Age: " + age;
    }


}