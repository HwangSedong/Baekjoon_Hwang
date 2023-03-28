import java.util.Scanner;

public class num_2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        int max=a[0];

        if(a[0]==a[1] && a[1]==a[2]){
            System.out.println(10000+(a[0]*1000));
        } else if (a[0]==a[1]) {
            System.out.println(1000+(a[0]*100));
        } else if (a[1]==a[2]) {
            System.out.println(1000+(a[1]*100));
        } else if (a[0]==a[2]) {
            System.out.println(1000+(a[0]*100));
        } else {
            for(i=0; i<2; i++){
                if(max<a[i+1]){
                    max = a[i+1];
                }
            }
            System.out.println(max*100);
        }
    }
}
