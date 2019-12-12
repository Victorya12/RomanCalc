
public class ArabicCalculator {

    private int a;
    private int b;
    char operator;

    public ArabicCalculator(int a, char operator, int b) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public double calculateResult() {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '/') {
            return a / b;
        } else if (operator == '*') {
            return a * b;
        }
        return 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

}
