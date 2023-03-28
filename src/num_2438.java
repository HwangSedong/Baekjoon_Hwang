import java.util.Scanner;

public class num_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k;
        for(int i=1; i<num+1; i++){
            k = i;
            while(k==0){
                System.out.print("*");
                k --;
            }
            System.out.println("");
        }
    }
}
