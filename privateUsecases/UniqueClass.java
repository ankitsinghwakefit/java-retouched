package privateUsecases;

public class UniqueClass {
    private static UniqueClass uniqueInstance;

    private UniqueClass(){
        System.out.println("UniqueClass... constructor");
    };

    public static UniqueClass getInstance(){
        if(uniqueInstance == null){
            return new UniqueClass();
        } else {
            return uniqueInstance;
        }
    };
}
