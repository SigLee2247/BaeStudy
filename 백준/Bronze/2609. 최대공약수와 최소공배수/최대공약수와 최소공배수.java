import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        System.out.println(gcd(num1,num2));
        System.out.println(lcm(num1,num2));

    }

    private static int gcd(int num1, int num2){
        return num2 == 0 ? num1 : gcd(num2, num1%num2);
    }
    private static int lcm(int num1, int num2){
        return num1 * num2 / gcd(num1,num2);
    }
}
