package packageTraining.packageVtornik_04_10;

import packageTraining.packageVtornik_04_10.Animal;

public class Cat extends Animal {

    @Override
    public void eat(){
        System.out.println("Niam-Niam!!!");
    }
    @Override
    public void golos(){
        System.out.println("Miav");
    }
}
