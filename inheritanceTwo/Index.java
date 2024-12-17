package inheritanceTwo;

public class Index{
    public static void main(String[] args) {
        Child c = new Child(12,"ankit");
        c.setName("ankitsd");
        c.sayName();
        c.changeName("null");
        c.sayName();
    }
}
