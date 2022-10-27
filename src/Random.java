public class Random {
    public int rndNum;
    public int max = 6;

    public int randomNumber(){
        rndNum = (int) (Math.random() * max) + 1;
        return rndNum;
    }
}
