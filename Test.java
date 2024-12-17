package javaPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getSum(5));
    }
    public static int getSum(int num){
        if(num == 1){
            return 1;
        }
        return num += getSum(num-1);
        // int res = 0;
        // for(int i = 1; i <= num; i++){
        //     res += i;
        // }
        // return res;
    }

    public static int getFactorial(int num){
        if(num == 1){
            return 1;
        }
        return num * getFactorial(num-1);
    }
}
