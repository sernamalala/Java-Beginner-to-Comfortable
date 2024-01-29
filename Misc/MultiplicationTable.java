/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplication.table;

import java.util.Scanner;

/**
 *
 * @author serna
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to generate a multiplication table: ");
        

        int numberInput = scanner.nextInt();
         System.out.println("The multiplication table of "+numberInput+": ");
        for(int i = 1; i<=12; i++){
        
            int multiply = numberInput*i;
            System.out.println(numberInput+" * "+i+" = "+multiply);
           
        }
    }
    
}
