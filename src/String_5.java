import java.util.Scanner;

public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //숫자의 개수
        String a = sc.next(); //숫자를 정수가 아닌 문자열로 입력받음

        int sum = 0; //su  초기화

        for(int i =0; i<N; i++){
            sum += a.charAt(i)-'0';

            //charAt()은 해당 문자의 아스키코드 값을 반환 하므로 반드시 -48 또는 -'0'을 해주어야 함
        }

        System.out.println(sum);
        //숫자개수 입력받고 -> 숫자를 문자열로 입력받아 -> 그 숫자를 char타입으로 변경 -> 아스키코드를 정수로 변경-> sum에 저장\
        //문자열이 정수가 될때 아스키코드 값을 반환
    }
}
