public class App {
    public static void main(String[] args) {
       int highscore = Integer.MAX_VALUE;
       System.out.println(highscore);
        for(int i = 0;i < 3; i++){
         NumberGuessGame game = new NumberGuessGame();
            game.playGame();
            if (game.guessCount < highscore){
                highscore = game.guessCount;
                System.out.println("New high score is: " + highscore);
            }
        }
        }
}
