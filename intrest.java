import java.util.Scanner;
public class intrest {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            System.out.print("enter the principal amount:");
         double p = sc.nextDouble();
         System.out.print("enter the rate of intrest:");
         double r = sc.nextDouble();
            System.out.print("enter the time period:");
            double t = sc.nextDouble();
            double SI = (p*r*t)/100;
            System.out.println("the simple intrest is :" + SI);

}
    
}
