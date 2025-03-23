public class Clas{
    public static void main(String args[]){
        Person person = new Person();
        person.setName("John");
        person.greet();
        person.name = "Doe";
        person.greet();

        John john = new John();
        john.setName("John");
        john.dontGreet();

    }

}

class Person {
    public String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }

}

class John extends Person {
    public void dontGreet() {
        System.out.println("I don't want to greet you");
    }
}