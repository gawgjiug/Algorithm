import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] poket = new int[N]; //1~N까지의 바구니
        int M = sc.nextInt(); //1~M까지의 공

        //둘째 줄 부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어짐 M번 반복
        for(int i=0; i<M;i++){
            //각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
            int I = sc.nextInt();
            int J = sc.nextInt();
            int k = sc.nextInt();
            for(int j = I-1; j<J; j++){ //배열의 Index는 0부터 시작하기 때문에 I-1을 해주어야 함 ex)2~5번 바구니의 6번 공을 넣겠다
                //Index 2번이라 함은 세번째 바구니임 때문에 -1
                poket[j] = k;
            }
        }

        for(int i =0; i< poket.length; i++){
            System.out.print(poket[i]+ " ");
        }





    }
}
