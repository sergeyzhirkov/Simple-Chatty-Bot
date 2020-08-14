import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        double sum = m+0.00001;
        int count = 0;
        while (sum<k){
            sum = (100.0+p)/100*sum;
            count++;
        }
        System.out.println(count);
    }
}