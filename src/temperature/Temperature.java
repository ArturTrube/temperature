/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в цельсиях: ");
        double celsius = in.nextDouble();
        double farenheit = (celsius * 9 / 5)  + 32;
        System.out.printf("Градусы в фаренгейтах = " + "%.2f", farenheit);
    }
    
}
