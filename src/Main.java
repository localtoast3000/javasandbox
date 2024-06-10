import pkgs.games.Dice;

public class Main {
    public static void main(String[] args){
       Dice dice = new Dice(2);
       System.out.println(dice.roll());
    }
}
