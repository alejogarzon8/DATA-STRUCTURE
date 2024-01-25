package CS235Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * EDWIN ALEJANDRO GARZON DIAZ
 * 
 * DETAIL OF THE ASSIGEMNT
 * The main purpose of the code is measure the time taken for the generation process,
 * the Array list and print relevant information about this.
 */
public class ArrayIteration {

    // Method to generate random numbers and measure the time taken
    public static List<Integer> generateRandomNumbers(int size) {
        long startTime = System.currentTimeMillis();  // Record the start time

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(100) + 1;  // Generate random numbers between 1 and 100
            if (random.nextBoolean()) {
                randomNumbers.add(randomNumber);
            }
        }

        long endTime = System.currentTimeMillis();  // Record the end time
        long elapsedTime = endTime - startTime;  // Calculate elapsed time

        // Display generated random numbers, array size, and elapsed time
        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers.toArray()));
        System.out.println("Array Size: " + randomNumbers.size());
        System.out.println("Time Elapsed: " + elapsedTime + " milliseconds");

        return randomNumbers;
    }

    // Method to generate sequential numbers and measure the time taken
    public static List<Integer> generateSequentialNumbers(int size) {
        long startTime = System.currentTimeMillis();  // Record the start time

        List<Integer> sequentialNumbers = new ArrayList<>();
        for (int i = 1; i <= size * 2; i += 2) {
            sequentialNumbers.add(i);
        }

        long endTime = System.currentTimeMillis();  // Record the end time
        long elapsedTime = endTime - startTime;  // Calculate elapsed time

        // Display generated sequential numbers, array size, and elapsed time
        System.out.println("Sequential Numbers: " + Arrays.toString(sequentialNumbers.toArray()));
        System.out.println("Array Size: " + sequentialNumbers.size());
        System.out.println("Time Elapsed: " + elapsedTime + " milliseconds");

        return sequentialNumbers;
    }

    // Main method to execute the code
    public static void main(String[] args) {
        // Generate 100 random numbers
        generateRandomNumbers(100);

        // Generate 100 sequential numbers
        generateSequentialNumbers(100);
    }
}