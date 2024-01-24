/**
 * DemoCalc
 */
public class DemoCalc {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        System.out.println(calc.add(23.5f, 3.78f));
        System.out.println(calc.divide(75.0f, 2.5f));
        System.out.println(calc.multiply(25.0f, 2f));
    }

    static class Calculator {
    
        private float num1;
        private float num2;

        public Calculator(){


        }

        public float add(float num1, float num2){

            return num1+num2;
        }

        public float minus(float num1, float num2){

            return num1-num2;
        }

        public float multiply(float num1, float num2){

            return num1*num2;
        }

        public float divide(float num1, float num2){

            return num1/num2;
        }
        
    }
}