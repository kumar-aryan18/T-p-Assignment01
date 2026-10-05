//Cricket Tournament Score Analyzer 
import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of matches : ");
        int n = sc.nextInt();
        int wins = 0;
        int ties =0;
        int points = 0;
        int loses =0;
        int TotalRun=0;
        int HighestScore =0;
        for(int i=0;i<n;i++){
             int TeamRun = sc.nextInt();
             int OpponentRun = sc.nextInt();
            if(TeamRun==OpponentRun){
                
                ties++;
                points += 1;
                TotalRun+=TeamRun;
                if(TeamRun>HighestScore || OpponentRun>HighestScore){
                    HighestScore = Math.max(TeamRun,OpponentRun);
                }
            }
            else if(TeamRun>OpponentRun){
                wins++;
                 points += 2;
                 TotalRun+=TeamRun;
                if(TeamRun>HighestScore){
                    HighestScore = TeamRun;
                }
            }
            else {
               loses++;
               TotalRun+=TeamRun;
                if(TeamRun>HighestScore){
                    HighestScore = TeamRun;
                }
            }
            
            
        }
        System.out.println("Wins : " + wins);
        System.out.println("Looses : " + loses);
        System.out.println("Ties : " + ties);
        System.out.println("Points : " + points);
        System.out.println("TotalRun : " + TotalRun);
        System.out.println("HighestScore : " + HighestScore);
    }
}
