/**
 *  @author Cristiano
 *  25/08/2022
 */
public class MultiThreadCompute {
    // Creating all the different threads to work with the different countries
    // First country Thread
    // Calling the methods from country related to country 1
    Thread C1 = new Thread(() -> {

        Country country = new Country();

        Country.sumFirstCountry();
        country.averageFirstCountry();
        country.maxValueFirstCountry();
        country.minValueFirstCountry();
    });
    // Second country Thread
    // Calling the methods from country related to country 2
    Thread C2 = new Thread(() -> {

        Country country = new Country();
        Country.sumSecondCountry();
        country.averageSecondCountry();
        country.maxValueSecondCountry();
        country.minValueSecondCountry();
    });
    // Third country Thread
    // Calling the methods from country related to country 3
    Thread C3 = new Thread(() -> {

        Country country = new Country();

        Country.sumThirdCountry();
        country.averageThirdCountry();
        country.maxValueThirdCountry();
        country.minValueThirdCountry();
    });
    // Fourth country Thread
    // Calling the methods from country related to country 4
    Thread C4 = new Thread(() -> {

        Country country = new Country();

        Country.sumFourthCountry();
        country.averageFourthCountry();
        country.maxValueFourthCountry();
        country.minValueFourthCountry();
    });
    // Fifth country Thread
    // Calling the methods from country related to country 5
    Thread C5 = new Thread(() -> {

        Country country = new Country();

        Country.sumFifthCountry();
        country.averageFifthCountry();
        country.maxValueFifthCountry();
        country.minValueFifthCountry();
    });
    // Grand total Thread
    // Calling the methods from country related to grand totals
    Thread grandTotal = new Thread(() -> {

        Country grandTotal = new Country();

        grandTotal.computeGrandSum();
        grandTotal.computeGrandAverage();
        grandTotal.computeGrandMax();
        grandTotal.computeGrandMin();
    });
}
