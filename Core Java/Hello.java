/**
 * Hello
 */

 //javac Hello.java
 //Write once run anyway
public class Hello {

    public static void main(String[] args) {


        int age =19;
        float you = 24.42f;
        System.out.println("You are "+you+" OMG A DECIMAL AGE!!");
        String name = "Tychique";
        String program = "N3 Course";
        char c = 'a';
        c++;
        System.out.println(c);
        System.out.println("Hi!\nMy name is "+name+" and I am "+age+" years old.\nI am studying "+program);


       String result =  (age>28) ? "Yoh You are old!" :  "My fellow Gen-Z!!";

       System.out.println(result);

       switch (age) {
        case 20:
        System.out.println("You are young");
            break;
       
        default:
        System.out.println("UGGH LEAME ALONEEE");
            break;
       }
    }
}