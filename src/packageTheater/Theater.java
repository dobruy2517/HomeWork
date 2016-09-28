package packageTheater;

import java.util.Scanner;

/**
 * Created by konstruktor on 28.09.2016.
 */
public class Theater {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        long m = vvod.nextLong();
        long n = vvod.nextLong();
        long a = vvod.nextLong();
        long quantityLenght = 0;
        long quantityWeight = 0;
        if (m % n == 0) {
            quantityLenght = m / a;
            quantityWeight = n / a;
            System.out.println(quantityLenght + quantityWeight);
        } else if (m % n != 0) {
            quantityLenght = (m / a) + 1;
            quantityWeight = (n / a) + 1;
            System.out.println(quantityLenght + quantityWeight);
        }

    }
}
