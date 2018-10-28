import java.util.Scanner;

public class LoopTest {

    public static void main(String[] args)
    {
        //loop exercises results

        Scanner scanner = new Scanner(System.in);
        String input = "";
        int star_number = 5;

        while(!input.equals("exit")) {
            System.out.println("which example you'd like to run? possible selsctions: 't1' or 't2' etc, up to 't8', or 'exit'");
            System.out.print("your selection: ");
            input = scanner.next();

            LoopTest looptest = new LoopTest();

            //System.out.println(input.intern());

            switch (input) {
                case "t1":
                    looptest.t1(star_number);
                    break;
                case "t2":
                    looptest.t2(star_number);
                    break;
                case "t3":
                    looptest.t3(star_number);
                    break;
                case "t4":
                    looptest.t4(star_number);
                    break;
                case "t5":
                    looptest.t5(star_number);
                    break;
                case "t6":
                    looptest.t6(star_number);
                    break;
                case "t7":
                    looptest.t7(star_number);
                    break;
                case "t8":
                    looptest.t8(star_number);
                    break;

                case "exit":
                    System.out.println("farewell");
                    break;

                default:
                    System.out.println("your choice is wrong, my friend, try again");
            }
        }

    }

    private void t1(int star_number)
    {
        for(int i = 0; i<star_number; i++)
        {
            System.out.print('*');
        }
    }

    private void t2(int star_number)
    {
        for(int i = 0; i<star_number; i++)
        {
            System.out.println('*');
        }
    }

    private void t3(int star_number)
    {
        for(int i = 0; i<star_number; i++)
        {
            for(int j = 0; j < star_number; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private void t4(int star_number)
    {
        for(int i = 0; i<star_number; i++)
        {

            for(int j = 0; j < star_number-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private void t5(int star_number)
    {
        for(int i = 0; i<star_number; i++)
        {
            for(int j = 0; j < star_number; j++)
            {
                if(j<i)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }

            /* //without use of 'if' statement
            for(int j = 0; j < i; j++)
            {
                System.out.print(' ');

            }
            for(int j = 0; j < star_number-i; j++) {
                System.out.print('*');
            }
            */

            System.out.println();
        }
    }

    private void t6(int star_number)
    {
        for(int i = 0; i < star_number; i++) {
            for (int j = 0; j < star_number; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
    }

    private void t7(int star_number)
    {
        for(int i = 0; i < star_number; i++) {
            for (int j = 0; j < star_number; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

    private void t8(int star_number)
    {
        int wynik;
        for(int i = 0; i < star_number; i++) {
            {
                wynik = i+1;
                for(int j = 0; j < star_number; j++) {
                    System.out.print(wynik);
                    System.out.print(' ');
                    wynik *= i+1;
                }
            }
            System.out.println();
        }
    }

}
