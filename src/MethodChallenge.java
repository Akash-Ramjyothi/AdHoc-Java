public class MethodChallenge {
    public static void main(String[] args) {

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 0;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            position = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}

class PositiveNegativeZero {
    // write code here
    public static void checkNumber(int number){
        if(number>0){
            System.out.print("positive");
        } else if(number < 0){
            System.out.print("negative");
        } else if(number == 0){
            System.out.print("zero");
        }
    }
}
