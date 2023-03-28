import java.io.*;
import java.util.Scanner;

public class num_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i<n; i++){
            String st = br.readLine();
            int a= Integer.parseInt(st.split(" ")[0]);
            int b= Integer.parseInt(st.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}
