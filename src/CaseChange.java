import java.util.Scanner;

public class CaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] arr = new int[N];

        for(int k=0; k<arr.length;k++){
            arr[k] = k+1;
        }

        int M = sc.nextInt();

        for(int i=0; i<M;i++){
            int tmp;
            int I = sc.nextInt() -1;
            int J = sc.nextInt() -1;


            while(I < J){ //뒤집을 배열의 범위 : I가 J보다 작을 때만 작업을 수행하고 범위가 역전되어 뒤집는 작업이 필요없어질 때 까지
                tmp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = tmp;
                //arr[order1++]과 arr[order2--] 는 while문의 조건을 만족하는동안 ex)1~4까지의 범위를 swap 하기 위해
            }



        }

        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
