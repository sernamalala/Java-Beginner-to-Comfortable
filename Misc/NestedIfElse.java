/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedifelse;

import java.util.Scanner;

/**
 *
 * @author serna
 */
public class NestedIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int marksObtained, passingMarks;
        char grade;
        
        passingMarks = 40;
        
        System.out.println("What score did you get on the exam?");
        Scanner input = new Scanner(System.in);
        marksObtained = input.nextInt();
        
        
        if(marksObtained>= passingMarks){
        
            if(marksObtained>90){
            
                grade = 'A';
            }
            
            else if(marksObtained>75){
            
                grade = 'B';
            }
            
            else if(marksObtained>60){
            
                grade = 'C';
            }
            else{
            
                grade = 'D';
            }
            
            System.out.println("You passed the exam with "+marksObtained+" points and your grade is "+grade);
        }
        
        else{
        
            grade = 'F';
            System.out.println("You failed the exam with "+marksObtained+" points and your grade is "+grade);
        }
    }
    
}
