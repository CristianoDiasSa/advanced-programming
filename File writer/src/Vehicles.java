/**
 *  @author Cristiano
 *  26/08/2022
 */
public class Vehicles {

    private final int Id;
    private final String Brand;
    private final int Mileage;
    private final int ProductionYear;

    // constructor
    public Vehicles(int Id, String Brand, int Mileage, int ProductionYear) {
        this.Id = Id;
        this.Brand = Brand;
        this.Mileage = Mileage;
        this.ProductionYear = ProductionYear;
    }

    public int getId() {
        return Id;
    }
    public String getBrand() {
        return Brand;
    }
    public int getMileage() {
        return Mileage;
    }
    public int getProductionYear() {
        return ProductionYear;
    }

}
