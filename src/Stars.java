import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=N;j>i;j--){
                System.out.print(" ");
            }
            for(int q=1;q<=i;q++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
