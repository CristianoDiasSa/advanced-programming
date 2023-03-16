import java.io.IOException;

public class VehiclesMain {
    public static void main(String[] args) throws IOException {

        // Instantiating the programme class so we can use its methods
        VehiclesProgramme VP = new VehiclesProgramme();

        // Using the method that will load the file contents on an array.
        VP.loadTxt();


        // Using the method to search into the car array for the toyota ones and exporting it into another file.
        VP.toyotaWriter();

        //Using the method to search into the car array for the ones with missing mileage and exporting it into another file
        VP.missingMileageWriter();
        VP.fordWriter();


    }
}
