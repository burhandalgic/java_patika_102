package Macera_Oyunu;
public abstract class NormalLocation extends Location{

    public NormalLocation(Player player, String locName) {
        super(player, locName);
    }

    @Override
    public abstract boolean onLocation();

}
