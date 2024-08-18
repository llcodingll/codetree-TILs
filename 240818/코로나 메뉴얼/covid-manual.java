import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;  // A로 분류된 사람 수를 세기 위한 변수

        // 3명의 입력을 받기 위해 반복
        for(int i = 0; i < 3; i++){
            char sym = sc.next().charAt(0);  // 감기 증상 (Y/N)
            int temp = sc.nextInt();      // 체온 (0 ≤ 주어지는 체온 ≤ 40)

            // 조건에 따라 분류
            if(sym == 'Y' && temp >= 37){
                cnt++;  // A로 분류된 사람 수 증가
            }
        }
        
        // A로 분류된 사람이 2명 이상이면 위급상황
        if(cnt >= 2){
           System.out.print("E");
        } else{
            System.out.print("N");
        }
    }
}