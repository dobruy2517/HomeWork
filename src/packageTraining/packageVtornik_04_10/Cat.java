package packageTraining.packageVtornik_04_10;

import packageTraining.packageVtornik_04_10.Animal;

public class Cat extends Animal {
    public static float maxWeigth = 21.3f;
    public String name = "Tom";

    @Override
    public void eat() {
        System.out.println("Niam-Niam!!!");
    }

    @Override
    public void golos() {
        System.out.println("Miav");
    }

    @Override
    public String toString() {
        return "I am cat. My name is: " + this.name + " is running";
    }

    public Cat(String name) {
        this.name = name;
    }
}
