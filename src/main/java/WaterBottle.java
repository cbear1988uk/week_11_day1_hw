public class WaterBottle {

    private int volume;
//    constructor

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public int takeDrink(int volume, int drink){
        return volume - drink;
    }

    public int empty(int volume){
        return volume - volume;
    }

    public int fill(int volume, int fill){
        return volume + fill;
    }
}
