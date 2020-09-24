package Town;

public class Main {


    public static void main(String[] args) {
        Streets town1 = new Traktornaya();
        Streets town2 = new Lenina();
        town2.parkZone=false;
        town2.houses=33;
        town1.houses = 3;
        town1.parkZone = true;
        Traktornaya thous1 = new TownHouse();
        thous1.setHouseType("Town house");
        thous1.addHouses();
        thous1.jirovka();
        thous1.stove=true;
        Lenina chouse1 = new ApartmentBlock();
        chouse1.apartments=45;
        chouse1.elevator=true;
        chouse1.setHouseType("City house");
        chouse1.addHouses();
        chouse1.jirovka();


    }


}
