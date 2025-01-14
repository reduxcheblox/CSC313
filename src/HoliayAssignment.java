/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Please note that this is a rough work & might have logic errors. Go through it first!!!
 */

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Gerald Kaile
 */
public class HoliayAssignment {
    public static void numberOneA(){
        for(int a = 0; a < 4; a++){
            System.out.println("****====****");
        }
    }

    public static void numberOneB(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            for(int k = 0; k < 4; k++){
                System.out.print("=");
            }
            for(int l = 0; l < 4; l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void numberTwoA(){
        for(int a = 0; a < 6; a++){
            if(a < 3){
                System.out.println("****======");
            }
            else {
                System.out.println("==========");
            }
        }
    }

    public static void numberTwoB(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                if(i < 3 && j < 4){
                    System.out.print("*");
                }
                else {
                    System.out.print("=");
                }
            }
            System.out.print("\n");
        }
    }

    public static void numberThree(){
        double[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        Arrays.sort(numbers);

        double sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        double mean = sum/numbers.length;


        double median;

        if(numbers.length % 2 == 0){
            int middleIndex = numbers.length/2;
            median = (numbers[middleIndex] + numbers[middleIndex+1])/2;
        }
        else {
            int middleIndex = numbers.length/2;
            median = numbers[middleIndex];
        }

        int N = numbers.length;

        double devSum = 0;
        double temp;
        for(int i = 0; i < numbers.length; i++){
           temp = (numbers[i] - mean);
           devSum += (temp*temp);
        }

        double standardDeviation = Math.sqrt((devSum)/N);

        System.out.println("Mean: " + mean + "\nMedian: " + median + "\nStandard Deviation: " + standardDeviation);
    }

    public static void numberFour(){
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Please enter value for index " + i + ": ");

            inputs[i] = scanner.nextLine();
        }

        for(int i = 0; i < 10; i++){
            System.out.println("You entered the value: " + inputs[i] + " in index " + i);
        }
        scanner.close();
    }

    public static void numberFive(){
        Scanner scanner = new Scanner(System.in);
        String[][] inputs = new String[10][10];

        for(int i = 0; i < 10; i++){
            String[] inner = new String[10];

            for(int j = 0; j < 10; j++){
                System.out.println("Please enter value for index where X:" + i + ", Y:" + j + " : ");
                inner[j] = scanner.nextLine();
            }

            inputs[i] = inner;
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println("You entered the value: " + inputs[i][j] + " in X: " + i + ", Y:" + j);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Question 1a: \n");
        numberOneA();
        System.out.println("Question 1b: \n");
        numberOneB();
        System.out.println("Question 2a: \n");
        numberTwoA();
        System.out.println("Question 2b: \n");
        numberTwoB();
        System.out.println("Question 3: \n");
        numberThree();
        System.out.println("Question 4: \n");
        numberFour();
        System.out.println("Question 5: \n");
        numberFive();
    }
}
