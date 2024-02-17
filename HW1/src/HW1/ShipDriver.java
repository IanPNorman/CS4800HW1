package HW1;

public class ShipDriver {
	public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("SES Sprear of Freedom", "2090");
        ships[1] = new CruiseShip("Crazy Fun Ship", "1988", 5400);
        ships[2] = new CargoShip("Black Pearl", "2003", 50000);

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
