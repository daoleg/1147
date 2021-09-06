import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextInt();
        System.out.println(num1+ (num1/100*15));
    }
}
