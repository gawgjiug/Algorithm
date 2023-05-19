
import java.util.Scanner;

public class String_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] s = new String[n];

        for(int i=0;i<n;i++){
            s[i] = sc.next();
            System.out.print(s[i].charAt(0));
            System.out.println(s[i].charAt(s[i].length()-1));
            //더하기 연산자 사용하면서 정수형으로 인식이 되었기 때문에 출력문 2개로 나눔

        }


    }
}
