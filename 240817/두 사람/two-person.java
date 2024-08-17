import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        String d = sc.next();

        if(a>=19&&b=="M" || c>=19&&d=="M"){
            System.out.print(1);
        } else if(a>=19&&b=="W" || c>=19&&d=="W"){
            System.out.print(0);
        } else if(a<=19&&b=="M" || c<=19&&d=="M"){
            System.out.print(0);
        } else if(a<=19&&b=="W" || c<=19&&d=="W"){
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }
}