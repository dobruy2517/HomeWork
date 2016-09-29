package packageTraining;

/**
 * Created by AID on 29.09.2016.
 */
public class Vuhodnue {
    private String name;
    private boolean isAlcohol;
    private int volumeAlcohol;

    public Vuhodnue(){
        this.name = "Pavluwa";
        this.isAlcohol = false;
        this.volumeAlcohol = 0;
    }

    public void buhoy(){
        this.isAlcohol = true;
        System.out.println("P'yanuy!!!");
    }

    public int vupilNemnogo(){
        this.volumeAlcohol = 15;
        return volumeAlcohol;
    }

    public String ppoliana(){
        return "Powli na poliany " + name + " piva popyem, litrov po " + volumeAlcohol;
    }

    public String getName(){
        return name;
    }

}
