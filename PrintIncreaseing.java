import java.util.Scanner;

public class PrintIncreaseing {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        printincreasing(n);
    }
    public static void printincreasing(int n){
        if(n==0){
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
}
