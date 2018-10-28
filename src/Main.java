import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println("Hello World");
        //simple types
        int variable = 2005;
        float flolt = 2349.08f;
        char znaczek = 's';
        boolean logiczny = true;

        //operators
        int result = variable + variable;

        int number1 = 7;
        int number2 = 3;
        int moduloResult = number1 % number2;

        // == != <= < > >=

        boolean comparisonResult = number2 == number1;

        System.out.println(comparisonResult);


        int number1 = 7;
        int number2 = 3;

        int[] array = new int[5];
        array[0] = 1;
        array[1] = number1;
        array[2] = number2;

        /*
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(i+" "+array[i]);
        }
        */

        /*
        for (int number : array)
        {
            System.out.println(number);
        }
        */

        /*
        int index = 0;
        int end = 10;
        do{
            System.out.println((index));
            index++;
        }while(index <= end);


        int index = 0;
        int end = -1;

        while(index <= end)
        {
            System.out.println(index);
            index++;
        }
        */

        //ex1
        // suma liczb naturalnych od 1 do n

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        System.out.println("Result is: " + sum);
    }
}
