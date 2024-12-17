package staticPractice;

public class Board {
    public static int schoolCount;
    static {
        System.out.println("Board static blog");
    }
    public Board(){
        System.out.println("Board constructor");
    }
}
