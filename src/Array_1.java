import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //수의 개수
        int [] A = new int[N]; //배열의 개수 지정

        int X = sc.nextInt(); //기준이 되는 수 지정

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(A[i]<X){
                System.out.println(A[i]);
            }
        }
    }
}
