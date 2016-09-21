package packageDuva;

/**
 * Created by AID on 21.09.2016.
 */
public class HomeWork {
    public static void main(String[] args) {
        System.out.println(maxValue(2, 4));
    }
    public static  int maxValue(int a, int b){
        int max = 0;
        if (a>b)
            max = a;
        else
            max = b;
        return max;

    }
}
