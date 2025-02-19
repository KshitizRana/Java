import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        L2_1();
    }
    static void L1_1() {
        System.out.println("Hello World");
    }
    static void L2_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int input=sc.nextInt();
        if(input%4==0 && (input%100!=0 || input%400==0)){
            System.out.println(input+" is a leap year");
        }
        else {
            System.out.println(input+" is not a leap year");
        }
    }
}