import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Am = sc.nextInt();
        int Ae = sc.nextInt();
        int Bm = sc.nextInt();
        int Be = sc.nextInt();

        if(Am > Bm) {
            System.out.print("A");
        } else if(Bm > Am) {
            System.out.print("B");
        } else if(Ae > Be){
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}