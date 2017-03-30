/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a4_randomnumber;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author feshu2250
 */
public class U2_A4_RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double min, max;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimun value: ");
        min = input.nextInt();
        
        System.out.print("Enter the maximum value: ");
        max = input.nextInt();
        
        int randomNum;
        Random r = new Random();
     
        randomNum = ((int)(Math.random()*(max-min)+min));
        System.out.println(randomNum);
    }
    
}
