import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double arr[] = new double[sc.nextInt()];

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        Arrays.sort(arr);//배열 오름차순 정리

        for(int i=0; i<arr.length;i++){
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.println(sum/arr.length);
    }
}


