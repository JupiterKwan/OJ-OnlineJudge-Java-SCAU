//最大公约数
import java.util.Scanner;
public class TEST1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i = Math.min(a, b); i >= 1; i--){
            if(a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
