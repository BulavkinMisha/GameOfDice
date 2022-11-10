public class Main{

    public static String PurpleColor = "\u001B[35m";
    public static String ResetColor = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println(PurpleColor + "---------------------------------" + ResetColor);
         Dice.diceCombination();
        System.out.println(PurpleColor + "---------------------------------");

        System.out.println("Check changes");

    }
}