package packageTraining;

import java.io.CharArrayReader;

/**
 * Created by AID on 29.09.2016.
 */
public class Car {
    private String brand;
    private double engineVolume;
    private boolean isBita;

    public Car() {
        this.brand = "TAZ";
        this.engineVolume = 1.5d;
        this.isBita = false;
    }

    public void crash() {
        this.isBita = true;
        System.out.println("Garagnoe hranenie!!!");
    }

    public String cheZaTachkaBrat() {
        return "Eto moi  " + brand + "Objem " + engineVolume+(isBita?"Raz tsarapnuv":"Ideal");
    }

    public String getBrand() {
        return brand;
    }

}
