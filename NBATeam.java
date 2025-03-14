import javax.swing.*;

public class NBATeam {
    private String team_name;
    private int win_record;
    private int loss_record;
    private String best_player_name;
    boolean made_playoffs;

    NBATeam(String team_name, int win_record, int loss_record, String best_player_name, boolean made_playoffs){

        if((win_record == 0 && loss_record == 0)||(win_record < 0 || loss_record < 0)){
            JOptionPane.showMessageDialog(null,"Violation made!");
        }
        else{
            this.win_record = win_record;
            this.loss_record = loss_record;
            this.team_name = team_name;
            this.best_player_name = best_player_name;
            this.made_playoffs = made_playoffs;
        }
    }
    double win_pct(){
        double win_pct = (double) win_record / (win_record + loss_record);
        return win_pct;
    }
    void best_player(){
        if (!made_playoffs && win_pct() < 0.5){
            System.out.println("Trade " + best_player_name);
        }
        else if (made_playoffs && win_pct() >= 0.6){
            System.out.println("Keep " + best_player_name);
        }
        else if (made_playoffs && (win_pct() >= 0.45 && win_pct() < 0.5)){
            System.out.println("Keep " + best_player_name);
        }
        else{
            System.out.println("Let's run with " + best_player_name + " next season");
        }
    }

}

