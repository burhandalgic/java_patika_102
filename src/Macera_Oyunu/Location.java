package Macera_Oyunu;
import java.util.Scanner;
public abstract class Location {
    private Player player;
    private String locName;
    public static Scanner input = new Scanner(System.in);
    public abstract boolean onLocation();
    public Location(Player player, String locName) {
        this.player = player;
        this.locName = locName;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public String getName() {
        return locName;
    }
    public void setName(String name) {
        this.locName = name;
    }
}
