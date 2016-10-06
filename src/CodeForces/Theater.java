//package packageTheater;

import java.util.Scanner;


public class Theater {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        long m = vvod.nextLong();
        long n = vvod.nextLong();
        long a = vvod.nextLong();
        long quantityLenght = 0;
        long quantityWeight = 0;
        if (m % a == 0) {
            quantityLenght = m / a;
        } else if (m % a != 0) {
            quantityLenght = (m / a) + 1;
        }
        if (n % a == 0) {
            quantityWeight = n / a;
        } else if (n % a != 0) {
            quantityWeight = n / a + 1;
        }
        System.out.println(quantityLenght * quantityWeight);
    }
}
