import java.util.Scanner;


public class Calculator {

    private static void startProg() {
        System.out.println("Welcome to Habsida calculator.\n" +
                           " You can use only 1-10 numbers.\n" +
                           " You can also use Arabic or Roman numbers.");

    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        startProg();


        while (true) {

            System.out.print("Input:");
            String line = sc.nextLine();


            try {
                String[] symbols = line.split("");
                if (symbols.length != 3) throw new Exception("Wrong input. Quitting...");

                Number firstNumber = TypeDetection.parseAndValidate(symbols[0]);
                Number secondNumber = TypeDetection.parseAndValidate(symbols[2], firstNumber.getType());
                String result = Engine.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output:" + result);
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        sc.close();
    }


}

