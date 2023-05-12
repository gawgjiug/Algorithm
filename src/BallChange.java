import java.util.Scanner;

public class BallChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];

        for(int k=0; k<N;k++){
            arr[k] = k+1;
        }

        for(int i=0; i<M;i++){
            int tmp;
            int I = sc.nextInt();
            int J = sc.nextInt();


            tmp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = tmp;
        }

        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
