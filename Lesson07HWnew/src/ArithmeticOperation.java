public class ArithmeticOperation {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 2;
        int resalt = sumNum(num1, num2);
        System.out.println("Sum metod int " + resalt);

        sumNumVoid(num1, num2);

        int subResult = subtractionNum(num1, num2);
        System.out.println("subtraction metod int " + subResult);

        subtractionNumVoid(num1, num2);

        int multiResul = multiNum(num1, num2);
        System.out.println("multi metod int " + multiResul);

        multiNumVoid(num1, num2);

        int dividingResult = dividingNum(num1, num2);
        System.out.println("dividing metod int " + dividingResult);

        dividingNumVoid(num1, num2);
    }
    public static int sumNum(int num1, int num2){
        return num1 + num2;
    }
    public static void sumNumVoid(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum metod void: " + sum);
    }
    public static int subtractionNum(int num1, int num2){
        return num1 - num2;
    }
    public static void subtractionNumVoid(int num1, int num2){
        int sub = num1 - num2;
        System.out.println("subtraction metod void: " + sub);
    }
    public static int multiNum(int num1, int num2){
        return num1 * num2;
    }
    public static void multiNumVoid(int num1, int num2){
        int multi = num1 * num2;
        System.out.println("multi metod void: " + multi);
    }
    public static int dividingNum(int num1, int num2){
        return num1 / num2;
    }
    public static void dividingNumVoid(int num1, int num2){
        int dividing = num1 / num2;
        System.out.println("dividing metod void: " + dividing);
    }


}
