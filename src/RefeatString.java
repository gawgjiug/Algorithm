import java.util.Scanner;

public class RefeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//테스트 케이스의 개수



        for(int i=0;i<T;i++){ //T만큼 테스트

            int R = sc.nextInt(); //문자를 반복하는 횟수
            String S = sc.next(); //문자열

            for(int j =0; j<S.length();j++){
                for(int k =0;k<R;k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
        //0,0일때 0~R보다 작을 때 까지
        //0,1일때 0~R보다 작을 때 까지
        //ex)일단 T번 반복됨 그리고 문자열 S의 사이즈가 3일때 R(3)번 반복할건데,
        //i가 0일때 j는 0부터 K는 0부터 3까지 총 3차례 동안 S(j,0)번째 단어를 반복 출력함
        //j가 1이되고 K는 다시 S(j,1) 두번째 단어를 반복 출력 끝나면 줄바꿈하고
        //다시 두번째 R과 S를 받음


    }
}
