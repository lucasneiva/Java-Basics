import java.util.Scanner;

public class BPIE6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println((float)num1/num2);
        System.out.println(num1 % num2);
    }
}