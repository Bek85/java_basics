package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    private static void printTicket(int[] array) {
        Arrays.sort(array);

        // Using enhanced for loop
        for (int number : array) {
            System.out.print(number + " | ");
        }

        // Using for loop
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " | ");
//        }

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH ; i++) {
            int randomNumber;

            do {
               randomNumber = random.nextInt(1, MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber ));
            ticket[i] = randomNumber;

        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for(int value : array) {
            if(value == numberToSearchFor) return true;
        }
        return false;
    }
}
