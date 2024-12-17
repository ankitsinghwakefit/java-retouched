package javaPractice;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "bob";
        Cat d = upper(cat);
        System.out.println(d.name);
        System.out.println(cat.name);
    }
    public static Cat upper(Cat cat) {
        cat.name = cat.name.toUpperCase();
        return  cat;
    }
}
