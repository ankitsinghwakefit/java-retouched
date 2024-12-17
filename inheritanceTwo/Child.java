package inheritanceTwo;

public class Child extends Parent {
    public void sayHi(){
        System.out.println("hii from child");
    }
    public void setName(String name){
        
    }
    public Child(int age, String name){
        super(age, name);
    }

}
