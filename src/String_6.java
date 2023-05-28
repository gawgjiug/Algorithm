import java.util.Scanner;




public class String_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String s = sc.nextLine();

            System.out.println(s);
        }

        //hasNextLine()은 입력 소스에 더 읽을 줄이 있는지 확인합니다. true를 반환하는 동안 nextLine()을 호출하여 다음 줄을 읽고 출력합니다
        //hasNextLine 은 입력을 라인 단위로 처리할 때 유용한 메서드임 ,


    }
}
