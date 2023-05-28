import java.util.Scanner;
import java.util.StringTokenizer;

public class Wordcount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        //StringTokenizer st에 입력받은 문자열 S를 공백으로 나눈 토큰들을 저장한다
        StringTokenizer st = new StringTokenizer(S," ");

        //countTokens() 는 토큰의 개수를 반환한다
        System.out.println(st.countTokens());
    }
}
