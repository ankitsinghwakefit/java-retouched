package inheritanceTwo;

public class Parent {
    public int age;
    protected String name;

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    protected void sayName(){
        System.out.println("my name is " + this.name);
    }

    protected void changeName(String name){
        this.name = name;
    }

    public void sayHi(){
        System.out.println("hii from parent");
    }
}
