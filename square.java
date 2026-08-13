import java.util.Scanner;
public class square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        int square = n*n;
        System.out.println("the square of " + n + " is " + square);
    }
    
}
