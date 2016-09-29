//package packageDlinueSlova;

import java.util.Scanner;
import java.util.StringTokenizer;


public class DlinueSlova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int length = str.length();
            if (length > 10) {
                    char c = str.charAt(0);
                    char d = str.charAt(length-1);
                    System.out.print(c);
                    System.out.print(length - 2);
                    System.out.println(d);
            } else {
                System.out.println(str);
            }
        }
    }
}
