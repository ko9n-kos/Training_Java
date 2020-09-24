package Town;

public class ApartmentBlock extends Lenina{

    @Override
    public void addHouses() {
        super.addHouses();
        if (getHouseType().contains("City")){
            leninaHouses.add(houseType);
        }
    }

}
