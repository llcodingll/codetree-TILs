import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        for(cnt = 0; cnt <= 3; cnt++){
            char a = sc.next().charAt(0);
            int b = sc.nextInt();
        

        if(a=='Y' && b>=37){
            cnt++;
        } else if(a=='N' && b>=37){

        } else if(a=='Y' && b<37){

        } else {

        }
        }
        
        if(cnt>=2){
           System.out.print("E");
        } else{
            System.out.print("N");
        }
    }
}