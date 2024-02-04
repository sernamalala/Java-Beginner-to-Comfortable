
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String input = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(input))){
            
            while(scan.hasNextLine()){
                System.out.println("Commands:");
                System.out.println("list - lists the recipes");
                System.out.println("stop - stops the program");
                String line = scanner.nextLine();
                
                if(line.toLowerCase().equals("stop")){
                
                    break;
                }
                
                if(line.toLowerCase().equals("list")){
                
                    System.out.println("Recipes:");
                    
                }
                
            
            }
            
        } catch (Exception ex) {
            
            System.out.println("Error: "+ex.getMessage());
        }
    }

}
