public class Dice {
    static Random random = new Random();

    public static void diceCombination() {

        int firstDice = random.randomNumber();
        int secondDice = random.randomNumber();

        System.out.println(firstDice + " и "
                + secondDice + " - Выпавшие числа на костях");

        if (((firstDice == 1)&&(secondDice == 1)) ||
                ((firstDice == 2)&&(secondDice == 2)) ||
                ((firstDice == 3)&&(secondDice == 3))||
                ((firstDice == 4)&&(secondDice == 4))||
                ((firstDice == 5)&&(secondDice == 5))||
                ((firstDice == 6)&&(secondDice == 6))) {
            System.out.println("О, Поевзло повезло! (Win)");
        }
        else {
            System.out.println("Хи-хи-ха! (Lose)");
        }
    }
}
