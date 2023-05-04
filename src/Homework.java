import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean [] student = new boolean[31]; //전체 반학생 수 30명의 배열 생성

        //30번째 인덱스 사용을 위해 배열의크기를 31로 지정


        for(int i=0; i<28; i++){ //과제를 제출한 28명 입력
            student[sc.nextInt()] = true; //입력 3 -> 인덱스 3 true
        }

        for(int i=1; i<=30;i++){ //1부터 30까지 돌면서 student 인덱스의 데이터가 false로 입력되어있는 인덱스 번호를 찾고 출력
            if(student[i]== false){
                System.out.println(i);
            }
        }
    }
}
