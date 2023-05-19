import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(s.charAt(n-1)); //맨 앞 문자는 0번째

        //charAt이란 string 타입으로 받은 문자열을 char 타입으로 한 글자만 받는 함수입니다
        //문자열 입력 받고 정수n을 입력받아
        //문자열 ->char 타입으로 변경하여 (n-1)번째 인덱스를 출력함

    }
}
