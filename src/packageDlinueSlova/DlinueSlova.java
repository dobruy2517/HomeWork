package packageDlinueSlova;

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
                for (int j = 0; j <= length; j++) {
                    char c = str.charAt(0);
                    char d = str.charAt(length);
                    System.out.println(c + length - 2 + d);
                }
            } else {
                System.out.println(str);
            }
        }
    }
}
