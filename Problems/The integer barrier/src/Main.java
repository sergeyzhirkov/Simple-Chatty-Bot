import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int i;
        int sum = 0;
        int count = 0;
        do{
            i = scanner.nextInt();
            sum+=i;
            count++;
            if (sum>=1000){
                System.out.println(sum-1000);
                break;
            }
        } while (scanner.hasNext() && i!=0);
        if (i==0){
            System.out.println(sum);
        }
    }
}