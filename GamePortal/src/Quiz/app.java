package Quiz;
import java.util.HashMap;

public class app {
    public static void main(String[] args) {
        HashMap<String, Integer> cMatches = new HashMap<String, Integer>();


        
        for(int i = 0;i < 15; i++){
          Quiz game = new Quiz();
            String Match = game.winner.label;
             if (cMatches.containsKey(Match)) {
                cMatches.put(Match, cMatches.get(Match)+1);
            
            } else {
                cMatches.put(Match, 1);

         }
      System.out.println("Quiz Frequency distribution:");
        for (String key : cMatches.keySet()) {
            System.out.println(key + ": " + cMatches.get(key));
             }
         }
        }
    }
         