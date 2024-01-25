
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
       Container first = new Container();
       Container second = new Container();

        while (true) {
            System.out.println("First:  "+first.contains()+"/100");
            System.out.println("Second:  "+second.contains()+"/100");

            String input = scan.nextLine();
            

            
            if (input.equals("quit")) {
                break;
            }
                        String[] inputValue = input.split(" ");
            String string = inputValue[0];
            int integer = Integer.valueOf(inputValue[1]);
            
            if(string.equals("add")){
            
               first.add(integer);
            }
            
          
            else if(string.equals("move")){
            
                if(integer + second.contains() <=100 && integer>0 && first.contains() >= integer){
                    
                    
                second.add(integer);
                first.remove(integer);
                }
                
                else if(second.contains()+integer>100 && integer>0 && first.contains() >= integer){
                
                    second.add(100);
                    first.remove(100);
                }
                
                else if(second.contains()+integer<=100 && integer>0 && first.contains() < integer){
                
                    second.add(first.contains());
                    first.remove(100);
                    
                }
            
                  
            }
            
            
            
            else if(string.equals("remove")){
            
                second.remove(integer);
               
        }
        }
    }

    

}
