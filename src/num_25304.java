import java.util.Scanner;

public class num_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt(); //영수증 가격
        int total=0, cost,pro; //총 예상 가격, 개당 가격, 개당 갯수
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            cost = sc.nextInt();
            pro = sc.nextInt();
            total = total+(cost*pro);
        }
        if(total==bill){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
