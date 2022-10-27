public class Dice {
    public int firstDice;
    public int secondDice;

    Random random = new Random();

    public void diceCombination() {

        firstDice = random.randomNumber();
        secondDice = random.randomNumber();

        System.out.println(firstDice + " и "
                + secondDice + " - Выпавшие числа на костях");

        if (((firstDice == 1)&&(secondDice == 1)) ||
                ((firstDice == 2)&&(secondDice == 2)) ||
                ((firstDice == 3)&&(secondDice == 3))||
                ((firstDice == 4)&&(secondDice == 4))||
                ((firstDice == 5)&&(secondDice == 5))||
                ((firstDice == 6)&&(secondDice == 6))) {
            System.out.println("О, Поевзло повезло");
        }
        else {
            System.out.println("Хи-хи-ха!");
        }
    }
}
