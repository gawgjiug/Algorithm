import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] N = new int[9];
        int max = N[0];
        int maxindex = 0;

        for (int i =0; i<9; i++){
            N[i] = sc.nextInt();
            if(max < N[i]){
                max = N[i];
                maxindex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxindex);




    }
}
