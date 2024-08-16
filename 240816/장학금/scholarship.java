import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 중간
        int b = sc.nextInt(); // 기말

        if(a >= 90 && b >= 95) {
            System.out.print(100000);
        } else if(a >= 90 && b >= 90) {
            System.out.print(50000);
        } else {
            System.out.print(0);
        }
    }
}