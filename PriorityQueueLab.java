import java.util.*;
import java.io.*;

public class PriorityQueueLab {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("RandIntegers.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                for (String number : numbers) {
                    priorityQueue.add(Integer.parseInt(number));
                }
            }

            reader.close();

            System.out.println("Sorted integers:");
            while (!priorityQueue.isEmpty()) {
                System.out.print(priorityQueue.poll() + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
            e.printStackTrace();
        }
    }
}
