package Inheritance;

public class Child extends Parent {
    @Override
    public void sayHi() {
        System.out.println("hi from child");
        super.sayHi();
    }
    public Child(){
        System.out.println("child constructor called"); 
    }

    public void cry(){
        System.out.println("child is crying");
    }
}
