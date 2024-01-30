
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
                ArrayList<Integer> list1 = new ArrayList<>();
               ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops: ");
       int sum = 0;
       double average = 0;
       
       int passSum = 0;
       double passAverage = 0;
       
        while(true){
        String input = scanner.nextLine();
            
            if(Integer.valueOf(input) == -1){
            
                break;
            }
            
            
            if(Integer.valueOf(input)>=0 && Integer.valueOf(input)<=100){
                
            list1.add(Integer.valueOf(input));
            
                if(Integer.valueOf(input)>=50){
            
                    list2.add(Integer.valueOf(input));
                
               
            }
              
            }
      
           
        }
        
        
            String five = "5: ";
            String four = "4: ";
            String three = "3: ";
            String two = "2: ";
            String one = "1: ";
            String zero = "0: ";
        for(int point: list1){
        
        
            sum+=point;
            average = sum*1.0/list1.size();

            

            if(point<50){
            
                zero+="*";
            }
            else if(point>=50 && point<60){
            
                one+="*";
            }
           else if(point >= 60 && point<70){
            
                two+="*";
            }
           else if(point >= 70 && point<80){
            
                three+="*";
            }
           else if(point >= 80 && point<90){
            
                four+="*";
            }
           else if(point >= 90 && point<=100){
           
               five+="*";
           }
            
        }
        for(int passingPoints : list2){
        passSum+=passingPoints;
            passAverage = passSum*1.0/list2.size();
            
            
        }
        
        double passPercent = 100*list2.size()*1.0/list1.size()*1.0;
        
        if(list1.size()>0 && list2.size()>0){
        System.out.println("Point average (all): "+average);
        System.out.println("Point average (passing): "+passAverage);
        System.out.println("Pass percentage: "+passPercent);
        System.out.println("Grade distribution:");
        System.out.println(five+"\n"+four+"\n"+three+"\n"+two+"\n"+one+"\n"+zero);
        }
        else{
        System.out.println("Point average (all): "+average);
        System.out.println("Point average (passing): -");
        System.out.println("Pass percentage: "+passPercent);
        System.out.println("Grade distribution:");
        System.out.println(five+"\n"+four+"\n"+three+"\n"+two+"\n"+one+"\n"+zero);
        }
    }
}
