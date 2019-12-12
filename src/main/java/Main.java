
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RomanCalculator roman;
        ArabicCalculator arabic;

        System.out.println("Input: ");
        String input = in.nextLine();
        double output = 0;

        String[] tokens = input.split(" ");
        try {
            //handle arabic values here
            if (Character.isDigit(tokens[0].charAt(0)) && Character.isDigit(tokens[2].charAt(0))) {
                int a = convertToInt(tokens[0]);
                char op = tokens[1].charAt(0);
                int b = convertToInt(tokens[2]);
                if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
                    if (op == '+' || op == '*' || op == '/' || op == '-') {
                        arabic = new ArabicCalculator(a, op, b);
                        output = arabic.calculateResult();
                        System.out.println("Output: ");
                        System.out.println(output);
                    } else {
                        System.out.println("Invalid Operator!");
                        System.exit(0);
                    }
                } else {
                    System.out.println("a & b values should be 1-10");
                    System.exit(0);
                }
            } //handle arabic values here
            else if (Character.isAlphabetic(tokens[0].charAt(0)) && Character.isAlphabetic(tokens[2].charAt(0))) {
                if(validateRoman(tokens[0]) && validateRoman(tokens[2])){
                    String a = tokens[0];
                    char op = tokens[1].charAt(0);
                    String b = tokens[2];
                    if (op == '+' || op == '*' || op == '/' || op == '-') {
                        roman = new RomanCalculator(a, op, b);
                        String out = roman.calculateResult();
                        System.out.println("Output: ");
                        System.out.println(out);
                    } else {
                        System.out.println("Invalid Operator!");
                        System.exit(0);
                    }
                }
                else{
                    System.out.println("a & b values should be I-X");
                    System.exit(0);
                }
            }
            else{
                System.out.println("Invalid Input Values!");
                System.exit(0);
            }
        } catch (Exception ex) {
            System.out.println("Invalid Input Format!");
            System.exit(0);
        }

    }

    public static int convertToInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch (Exception ex) {
            System.out.println("Invalid Input Format!");
            System.exit(0);
        }
        return 0;
    }

    public static boolean validateRoman(String str) {
        if(str.equals("I") || str.equals("II") || str.equals("III") || str.equals("IV") || str.equals("V") ||
                str.equals("VI") || str.equals("VII") || str.equals("VIII") || str.equals("IX") ||
                str.equals("X")){
            return true;
        }
        return false;
    }
}
