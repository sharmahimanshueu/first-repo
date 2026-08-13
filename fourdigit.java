import java.util.Scanner;
public class fourdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("the number is four digit number");
        }
        else
            System.out.println("the number is not four digit number");
    }
    
}
