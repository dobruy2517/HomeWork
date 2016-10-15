package packageTraining.packageDz_04_10;


public class Igor extends Students {
    public Igor(String name, boolean isAlcohol, int volumeAlcohol){
        name ="Igor";


    }
    @Override
    public void move(){
        System.out.println("Can't to move!");
    }
    @Override
    public void drink(){
        System.out.println("Go to the night club!!!");
    }
}
