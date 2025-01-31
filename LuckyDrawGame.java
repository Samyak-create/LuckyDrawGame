import java.util.Scanner;
import java.util.Random;
public class LuckyDrawGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to lucky Draw Game ");
        System.out.println("Enter a number between 1 to 10");

        int n=sc.nextInt();
        if(n<1 || n>10){
            System.out.println("Enter a valid number");
        }else{
            int randomNumber=random.nextInt(10)+1;
            System.out.println("Lucky Draw Number :"+randomNumber);
            if(n==randomNumber){
                System.out.println("Congratulations You Win !");
            }else{
                System.out.println("Better Luck Next Time");
            }
    }
    sc.close();
}
}