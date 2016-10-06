package packageTraining.packageVtornik_04_10;


public abstract class Animal extends Object implements Moveble {
    protected boolean isHungry = true;

    public void eat() {
        isHungry = false;
        System.out.println("Niam-Niam!!!");
    }

    public void status() {
        if (isHungry == true) {
            System.out.println("Day-day");
        } else {
            System.out.println("use");
        }
    }

    @Override
    public void move() {
        System.out.println("Go-GO");
    }

    public void itTooMuch() {
        isHungry = false;
    }

    public abstract void golos();

}
