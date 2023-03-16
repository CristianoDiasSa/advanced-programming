/**
 *  @author Cristiano
 *  25/08/2022
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Country {
    // the arraylist that contains all the 5 countries

    static ArrayList<Integer>[] countries = new ArrayList[5];
    // the data that contains the statistics of each country
    static long[] sum = {0, 0, 0, 0, 0};
    static float[] average = {0, 0, 0, 0, 0};
    static int[] min = {0, 0, 0, 0, 0};
    static int[] max = {0, 0, 0, 0, 0};

    public Country() {
    }

    // The code that generates the country data using random function

    public static ArrayList[] generateData() {
        Random random = new Random();
        // for testing purpose you may fix the random value to a constant
        random.setSeed(4);
        for (int i = 0; i < 5; i++) {
            // Generates 10000 random numbers between -10,000 and 10,000
            int[] numbers = random.ints(10000, -10000, 10000).toArray();
            countries[i] = new ArrayList<>();
            for (int number : numbers) {
                countries[i].add(number);
            }
        }
        return countries;

    }

    /**
     -------------------------------------------------------------------------------------------------------------
     *First Country
     */
    public static void sumFirstCountry(){
        long sumFirst = 0;
        for (int i = 0; i<countries[0].size(); i++){
            sumFirst +=countries[0].get(i);
        }

        // Writing the value into the corresponding index on the corresponding array
        sum[0] = sumFirst;
        System.out.println("The sum of the first country is: " + sumFirst);
    }
    public void averageFirstCountry(){
        float averageFirstCountry;
        int sum = 0;
        for (int i = 0; i<countries[0].size(); i++){
            sum+= countries[0].get(i);
        }
        averageFirstCountry = sum/countries[0].size();
        System.out.println("The average of the first country is: " + averageFirstCountry);
        // Writing the value into the corresponding index on the corresponding array
        average[0] = averageFirstCountry;
    }
    public void maxValueFirstCountry(){
        int maxValue = Collections.max(countries[0]);
        System.out.println("The maximum value of the first country is: " + maxValue);
        // Writing the value into the corresponding index on the corresponding array
        max[0] = maxValue;
    }
    public void minValueFirstCountry(){
        int minValue = Collections.min(countries[0]);
        System.out.println("The minimum value of the first country is: " + minValue);
        // Writing the value into the corresponding index on the corresponding array
        min[0] = minValue;
    }

    /**
     -------------------------------------------------------------------------------------------------------------
     *Second Country
     */
    public static void sumSecondCountry(){
        long sumSecond = 0;
        for (int i = 0; i<countries[1].size(); i++){
            sumSecond +=countries[1].get(i);
        }
        // Writing the value into the corresponding index on the corresponding array
        sum[1] = sumSecond;
        System.out.println("The sum of the second country is: " + sumSecond);
    }
    public void averageSecondCountry(){
        float averageSecondCountry;
        int sum = 0;
        for (int i = 0; i<countries[1].size(); i++){
            sum+= countries[1].get(i);
        }
        averageSecondCountry = sum/countries[1].size();
        System.out.println("The average of the second country is: " + averageSecondCountry);
        // Writing the value into the corresponding index on the corresponding array
        average[1] = averageSecondCountry;
    }
    public void maxValueSecondCountry(){
        int maxValue = Collections.max(countries[1]);
        System.out.println("The maximum value of the second country is: " + maxValue);
        // Writing the value into the corresponding index on the corresponding array
        max[1] = maxValue;
    }
    public void minValueSecondCountry(){
        int minValue = Collections.min(countries[1]);
        System.out.println("The minimum value of the Second country is: " + minValue);
        // Writing the value into the corresponding index on the corresponding array
        min[1] = minValue;
    }
    /**
     -------------------------------------------------------------------------------------------------------------
     *Third Country
     */
    public static void sumThirdCountry(){
        long sumThird = 0;
        for (int i = 0; i<countries[2].size(); i++){
            sumThird +=countries[2].get(i);
        }
        // Writing the value into the corresponding index on the corresponding array
        sum[2] = sumThird;
        System.out.println("The sum of the third country is: " + sumThird);
    }
    public void averageThirdCountry(){
        float averageThirdCountry;
        int sum = 0;
        for (int i = 0; i<countries[2].size(); i++){
            sum+= countries[2].get(i);
        }
        averageThirdCountry = sum/countries[2].size();
        System.out.println("The average of the third country is :" + averageThirdCountry);
        // Writing the value into the corresponding index on the corresponding array
        average[2] = averageThirdCountry;
    }
    public void maxValueThirdCountry(){
        int maxValue = Collections.max(countries[2]);
        System.out.println("The maximum value of the third country is: " + maxValue);
        // Writing the value into the corresponding index on the corresponding array
        max[2] = maxValue;
    }
    public void minValueThirdCountry(){
        int minValue = Collections.min(countries[2]);
        System.out.println("The minimum value of the third country is: " + minValue);
        // Writing the value into the corresponding index on the corresponding array
        min[2] = minValue;
    }
    /**
     -------------------------------------------------------------------------------------------------------------
     *Fourth Country
     */
    public static void sumFourthCountry(){
        long sumFourth = 0;
        for (int i = 0; i<countries[3].size(); i++){
            sumFourth +=countries[3].get(i);
        }
        // Writing the value into the corresponding index on the corresponding array
        sum[3] = sumFourth;
        System.out.println("The sum of the fourth country is: " + sumFourth);
    }
    public void averageFourthCountry(){
        float averageFourthCountry;
        int sum = 0;
        for (int i = 0; i<countries[3].size(); i++){
            sum+= countries[3].get(i);
        }
        averageFourthCountry = sum/countries[3].size();
        System.out.println("The average of the fourth country is: " + averageFourthCountry);
        // Writing the value into the corresponding index on the corresponding array
        average[3] = averageFourthCountry;
    }
    public void maxValueFourthCountry(){
        int maxValue = Collections.max(countries[3]);
        System.out.println("The maximum value of the fourth country is: " + maxValue);
        // Writing the value into the corresponding index on the corresponding array
        max[3] = maxValue;
    }
    public void minValueFourthCountry(){
        int minValue = Collections.min(countries[3]);
        System.out.println("The minimum value of the fourth country is: " + minValue);
        // Writing the value into the corresponding index on the corresponding array
        min[3] = minValue;
    }
    /**
     -------------------------------------------------------------------------------------------------------------
     *Fifth Country
     */
    public static void sumFifthCountry(){
        long sumFifth = 0;
        for (int i = 0; i<countries[4].size(); i++){
            sumFifth +=countries[4].get(i);
        }
        // Writing the value into the corresponding index on the corresponding array
        sum[4] = sumFifth;
        System.out.println("The sum of the fifth country is: " + sumFifth);
    }
    public void averageFifthCountry(){
        float averageFifthCountry;
        int sum = 0;
        for (int i = 0; i<countries[4].size(); i++){
            sum+= countries[4].get(i);
        }
        averageFifthCountry = sum/countries[4].size();
        System.out.println("The average of the fifth country is: " + averageFifthCountry);
        // Writing the value into the corresponding index on the corresponding array
        average[4] = averageFifthCountry;
    }
    public void maxValueFifthCountry(){
        int maxValue = Collections.max(countries[4]);
        System.out.println("The maximum value of the fifth country is: " + maxValue);
        // Writing the value into the corresponding index on the corresponding array
        max[4] = maxValue;
    }
    public void minValueFifthCountry(){
        int minValue = Collections.min(countries[4]);
        System.out.println("The minimum value of the fifth country is: " + minValue);
        // Writing the value into the corresponding index on the corresponding array
        min[4] = minValue;
    }



    public void computeGrandSum() {
        long grandSum = 0;
        // Iterating through sum array to find the sum grand total
        for (long countryTotal : sum) {
            grandSum += countryTotal;
        }
        System.out.println("The grand sum total is: " + grandSum);
    }

    public void computeGrandAverage() {
        float grandAvgSum = 0;
        // Iterating through average array to find the average grand total
        for (float AverageCountryTotal : average) {
            grandAvgSum += AverageCountryTotal;
        }
        System.out.println("The grand average total is: " + grandAvgSum);
    }
    public void computeGrandMax() {
        int grandMax = 0;
        // Iterating through max array to find the max grand total
        for (int maxNumber : max) {
            if (grandMax < maxNumber) {
                grandMax = maxNumber;
            }
        }
        System.out.println("The highest value is: " + grandMax);
    }

    public void computeGrandMin() {
        int grandMin = 0;
        // Iterating through min array to find the min grand total
        for (int minNumber : min) {
            if (grandMin > minNumber) {
                grandMin = minNumber;
            }
        }
        System.out.println("The min value on all countries is: " + grandMin);
    }
}
