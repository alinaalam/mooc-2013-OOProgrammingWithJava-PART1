
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        /*
        Print the top ten players based on goals
        Print the top 25 players based on penalty amounts
        Print the statistics for Sidney Crosby
        Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in 
        which order the players are printed in and why that might be!
        Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        */
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("******************************");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("******************************");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("******************************");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("******************************");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        System.out.println("******************************");
    }
}
