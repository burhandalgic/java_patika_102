package Lig_Fikstür_Oluşturma;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> teams = new ArrayList<>();
        System.out.println("TAKIMLARI GİRİNİZ ARDINDAN \"OK\" YAZINIZ: ");
        Scanner input = new Scanner(System.in);
        String s;
        while(true) {
            s = input.nextLine();
            if (s.equals("OK")) {
                break;
            } else {
                teams.add(s);
            }
        }

            if (teams.size()%2!=0){  teams.add("BAY");  }
            Collections.shuffle(teams);


        System.out.println("TAKIM LİSTESİ : ");
        System.out.println(".................");
        int i = 1;
        for (String x : teams){
            System.out.print(i + " - " );
            System.out.println(x);
            i++;
        }

        int teamsNumber = teams.size();
        int weekMatchNumber = teamsNumber/2;
        int leagueWeekNumber =(teamsNumber-1)*2;
        int halfLeaugeWeekNumber=teamsNumber-1;
        Match[][] league = new Match[leagueWeekNumber][weekMatchNumber];


        int centerİndex=teamsNumber/2;
        for (int lwn=0;lwn<halfLeaugeWeekNumber;lwn++) {
            for (int k = 0; k < weekMatchNumber; k++) {
                if (k==0) {
                    league[lwn][k] = new Match(teams.get(0),teams.get(centerİndex));
                }else {
                    league[lwn][k] = new Match(teams.get(k),teams.get(teamsNumber-k));
                }
                league[lwn+halfLeaugeWeekNumber][k] = new Match(league[lwn][k].getVisitorTeam(), league[lwn][k].getHomeTeam(),0);
            }
            teams.add(1,teams.get(teamsNumber-1));
            teams.remove(teamsNumber);
        }


        for (int h=0;h<leagueWeekNumber;h++){
            System.out.println("-------------" + (h+1) + ". HAFTA MAÇ PROGRAMI" + "-------------");
            for (int z=0;z<weekMatchNumber;z++){
                System.out.print((z+1) + " - " );
                System.out.println(league[h][z].getHomeTeam() + " <-> " + league[h][z].getVisitorTeam());
            }
        }





    }
    }