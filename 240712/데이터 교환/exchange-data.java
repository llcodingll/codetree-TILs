public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp;
        //int temp2;

        // temp = c;
        // temp2 = a;
        // c = b;
        // a = temp;
        // b = temp2;
        
        temp = a;
        a = c;
        c = b;
        b = temp;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}