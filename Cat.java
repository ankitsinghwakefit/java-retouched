package javaPractice;

public class Cat extends Animal {
    public void meow(){
        System.out.println("cat can meow!");
    }
    String name;
    @Override
    public void makeSound(){
        System.out.println("Meowing...");
    }
}
