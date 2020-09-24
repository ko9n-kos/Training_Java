package Town;

public class TownHouse extends Traktornaya{

    @Override
    public void addHouses() {
        super.addHouses();
        if (getHouseType().contains("Town")){
            traktornayaHouses.add(houseType);
        }
    }

}
