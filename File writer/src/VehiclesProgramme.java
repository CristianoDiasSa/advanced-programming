/**
 *  @author Cristiano
 *  26/08/2022
 */
import java.io.*;
import java.util.Scanner;

public class VehiclesProgramme {

    // Declaring the global variable to instantiate the file content.
    Vehicles[] cars = new Vehicles[20];

    // Method that will be responsible to load the txt file into the array.
    // Same as Ca
    public  void loadTxt() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Crist\\Desktop\\" +
                "Computer Science\\Second semester\\Advanced Programming\\AAPTaba\\AAPTaba_Question3\\src\\taba.txt"));

        int i = 0;
        String st;


        while (sc.hasNextLine())
        {
            st = sc.nextLine();
            st = st.replace("\"", "");
            String[] data = st.split(",");
            if (data[2].equals(" ")) {
                data[2] = "0";
            }
            cars[i] = new Vehicles(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
            i++;
        }

        sc.close();

        // Printing the values inside the array.
        System.out.println("Id, Brand, Mileage, Production_Year");
        for (Vehicles car : cars) {
            System.out.println(car.getId() + ", " + car.getBrand() + ", " +
                    "" + car.getMileage() + ", " + car.getProductionYear());
        }


    }
    // Method that will compare the values inside the array and export the desired ones to an external file.
    public void toyotaWriter() throws IOException {
        // creating a whiter object and specifying the name of the file it will create as well as where to create it.
        BufferedWriter toyotaWriter = new BufferedWriter(new FileWriter("C:\\Users\\Crist\\Desktop" +
                "\\Computer Science\\Second semester\\Advanced Programming" +
                "\\AAPTaba\\AAPTaba_Question3\\src\\Toyota.txt"));

        // Writing some header
        toyotaWriter.write("ID, Brand, Mileage, Production_year\n");

        // Iterating through the array
        for(Vehicles carModel : cars ){

            // Searching for the toyota models
            if(carModel.getBrand().equals("Toyota")){

                // Writing the object to the file
                toyotaWriter.write(carModel.getId() + ", " + carModel.getBrand() + ", " +
                        "" + carModel.getMileage() + ", " + carModel.getProductionYear() + "\n");

            }

        }
        // Closing writer
        toyotaWriter.close();
    }
    // Method that will compare the values inside the array and export the desired ones to an external file.
    public void missingMileageWriter() throws IOException {
        BufferedWriter missingMileageWriter = new BufferedWriter(new FileWriter("C:\\Users\\Crist\\Desktop" +
                "\\Computer Science\\Second semester\\Advanced Programming\\AAPTaba" +
                "\\AAPTaba_Question3\\src\\Missing_Mileage.txt"));
        missingMileageWriter.write("ID, Brand, Mileage, Production_year\n");
        for(Vehicles carModel : cars ){
            if(carModel.getMileage() == 0){
                missingMileageWriter.write(carModel.getId() + ", " +
                        "" + carModel.getBrand() + ", Missing Mileage, " + carModel.getProductionYear() + "\n");

            }

        }
        // Closing writer
        missingMileageWriter.close();
    }

    public void fordWriter() throws IOException {
        // creating a whiter object and specifying the name of the file it will create as well as where to create it.
        BufferedWriter toyotaWriter = new BufferedWriter(new FileWriter("C:\\Users\\Crist\\Desktop" +
                "\\Computer Science\\Second semester\\Advanced Programming" +
                "\\AAPTaba\\AAPTaba_Question3\\src\\Ford.txt"));

        // Writing some header
        toyotaWriter.write("ID, Brand, Mileage, Production_year\n");

        // Iterating through the array
        for(Vehicles carModel : cars ){

            // Searching for the toyota models
            if(carModel.getBrand().equals("Ford")){

                // Writing the object to the file
                toyotaWriter.write(carModel.getId() + ", " + carModel.getBrand() + ", " +
                        "" + carModel.getMileage() + ", " + carModel.getProductionYear() + "\n");

            }

        }
        // Closing writer
        toyotaWriter.close();
    }

}
