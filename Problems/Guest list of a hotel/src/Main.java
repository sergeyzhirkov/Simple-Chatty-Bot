//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] arrayOfStrings = new String[8];
        int count = 0;
        while (sc.hasNext()){
            arrayOfStrings[count++] = sc.next();
        }
        for (int i = arrayOfStrings.length-1; i >=0 ; i--) {
            System.out.println(arrayOfStrings[i]);
        }
    }
}