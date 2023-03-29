/**
 *  @author Cristiano
 *  25/08/2022
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      // Instantiating the multithreading class
      MultiThreadCompute thread = new MultiThreadCompute();
      // Generating the data
      ArrayList<Country>[] country = Country.generateData();

      System.out.println("Details for Country 1\n");
      // Running thread 1
      thread.C1.run();
      System.out.println("\n--------------------------------------------------------------------\n");

      System.out.println("Details for Country 2\n");
      // Running thread 2
      thread.C2.run();
      System.out.println("\n--------------------------------------------------------------------\n");

      System.out.println("Details for Country 3\n");
      // Running thread 3
      thread.C3.run();
      System.out.println("\n--------------------------------------------------------------------\n");

      System.out.println("Details for Country 4\n");
      // Running thread 4
      thread.C4.run();
      System.out.println("\n--------------------------------------------------------------------\n");

      System.out.println("Details for Country 5\n");
      // Running thread 5
      thread.C5.run();
      System.out.println("\n--------------------------------------------------------------------\n");

      System.out.println("Grand totals\n");
      // Running Grand Total Thread
      thread.grandTotal.run();
    }

}