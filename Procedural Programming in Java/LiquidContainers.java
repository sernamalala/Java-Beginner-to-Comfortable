
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First:  "+first+"/100");
            System.out.println("Second:  "+second+"/100");

            String input = scan.nextLine();
            

            
            if (input.equals("quit")) {
                break;
            }
                        String[] inputValue = input.split(" ");
            String string = inputValue[0];
            int integer = Integer.valueOf(inputValue[1]);
            
            if(string.equals("add")){
            
                if(first + integer <=100 && integer>0){
                    
                first+= integer;
                }
                
                else if(first+integer>100 && integer>0){
                
                    first = 100;
                }
            }
            
          
            else if(string.equals("move")){
            
                if(integer + second <=100 && integer>0 && first >= integer){
                    
                    
                second+= integer;
                first-= integer;
                }
                
                else if(second+integer>100 && integer>0 && first >= integer){
                
                    second = 100;
                    first = 0;
                }
                
                else if(second+integer<=100 && integer>0 && first < integer){
                
                    second +=first;
                    first = 0;
                    
                }
            
                  
            }
            
            
            
            else if(string.equals("remove")){
            
                if(integer > second && integer>0 ){
                    
                second=0;
                }
                
                else if(second-integer<=100 && integer>0){
                
                    second -= integer ;
                }
                
               
            }

        }
    }

}
