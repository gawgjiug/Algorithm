import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int [] N = new int[A]; //A만큼의 정수
        int max = 0;
        int min = 0;

        for(int i = 0; i<A; i++){
            N[i] = sc.nextInt();

        }
        sc.close();

        Arrays.sort(N); //배열의 저장된 원소 값을 오름차순으로 정렬해주는 메서드
        System.out.println(N[0]+" "+N[A-1]);

        //A가 5일 때 현재 4번에 max값이 존재하기 때문에 -1


    }
}
