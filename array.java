public class array{
    public static void main (String[] args){
        int [] x = {1,2,3,4,5,6,7,8};
        int multiple = 1;
        for(int i=0; i< x.length ;i++)
            multiple*=x[i];
        System.out.println("the multiplication of the array is :" + multiple);
    }
}