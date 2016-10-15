package packageTraining.packageVtornik_04_10;

public class RunAnimal {
    public final static Cat MURSIK = new Cat("sa");
    public static Cat tom = new Cat("Via");
    public static Cat cat = new Cat("Vssia");

    public static void main(String[] args) {
        System.out.println(Cat.maxWeigth);
        Cat.maxWeigth = 22;
        System.out.println(MURSIK.maxWeigth);
        System.out.println(tom.maxWeigth);
    }
}