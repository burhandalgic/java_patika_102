package Lig_Fikstür_Oluşturma;

import java.util.Random;

public class Match {
    private String homeTeam="BOŞ";
    private String visitorTeam="BOŞ";

    private boolean fifty(){
        Random random = new Random();
        int x=random.nextInt(2);
        if (x==0) return false;
        else return true;
    }

    public Match(String team1, String team2) {
        if (fifty()){
        this.homeTeam = team1;
        this.visitorTeam = team2;
        }else {
            this.homeTeam = team2;
            this.visitorTeam = team1;
        }
    }

    public Match(String homeTeam, String visitorTeam,int i) {

            this.homeTeam = homeTeam;
            this.visitorTeam = visitorTeam;

    }


    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(String visitorTeam) {
        this.visitorTeam = visitorTeam;
    }
}
