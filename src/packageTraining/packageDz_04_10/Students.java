package packageTraining.packageDz_04_10;


public class Students extends Moveble implements InorodnoeTelo {
    private String name;
    private boolean isAlcohol;
    private int volumeAlcohol;

    public Students() {
        this.name = "Pavluwa";
        this.isAlcohol = false;
        this.volumeAlcohol = 0;
    }

    public void buhoy() {
        this.isAlcohol = true;
        System.out.println("P'yanuy!!!");
    }

    public int vupilNemnogo() {
        this.volumeAlcohol = 15;
        return volumeAlcohol;
    }

    public String ppoliana() {
        return "Powli na poliany " + name + " piva popyem, litrov po " + volumeAlcohol;
    }

    public String getName() {
        return name;
    }
    @Override
    public void move(){
        System.out.println("Go to slip");
    }
    @Override
    public void drink(){
        System.out.println("Go to the club!!!");
    }
}
