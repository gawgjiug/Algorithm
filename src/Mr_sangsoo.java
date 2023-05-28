import java.util.Scanner;

public class Mr_sangsoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        //먼저 StringBulilder는 문자열을 다루는 클래스에서 reverse()라는메소드를 사용해서 문자열을 거꾸로 뒤집어줌
        //append라는 메소드에 값을 넣어주고 이때 append로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환됨
        //reverse로 뒤집음 , 그리고 toString으로 StringBuilder 타입을 문자열로 반환시킴
        //문자열로 반환 시킨것을 다시 Integer.paeseint로 int로 타입으로 변경시킴

        System.out.print(A > B ? A : B);
    }
}
