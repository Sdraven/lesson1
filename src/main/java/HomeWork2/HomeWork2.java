package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
compareSum(-145,185);
compareNumeric(10);
System.out.print(compareNumericReturn(-10));
printString(4,"hello world! Hello everybody");
System.out.print(compareYear(1904));
    }

    public static void compareSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void compareNumeric(int c) {
        if(c <= 0) {
            System.out.println("Отрицательное число");
        }
         else {
           System.out.println("Положительное число");
            }
        }
    public static boolean compareNumericReturn(int d) {
        return d < 0;
    }

    public static void printString(int e, String str){
        while (e > 0) {
            System.out.println(str);
            e--;
        }
    }
    public static boolean compareYear(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    }
