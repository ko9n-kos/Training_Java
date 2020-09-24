package Town;

import java.util.ArrayList;
import java.util.List;

public class Streets {

    public int houses;
    public boolean parkZone;
    public String houseType;

    public int getHouses() {
        return houses;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }

    public boolean isParkZone() {
        return parkZone;
    }

    public void setParkZone(boolean parkZone) {
        this.parkZone = parkZone;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public void addHouses(){
    };
    List<String> traktornayaHouses = new ArrayList<String>();
    List<String> leninaHouses = new ArrayList<>();

    public void jirovka(){
        if(traktornayaHouses.contains(getHouseType())){
            System.out.println(350);
            }if(leninaHouses.contains(getHouseType())){
            System.out.println(450);
        }
    }
}
