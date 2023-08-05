import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome()  {
        System.out.print("Enter a number to check for palindrome: ");
        int num = sc.nextInt();

        int orgNum = num;
        int revNum = 0;

        while (num!=0) {
            int digit = num%10;
            revNum = revNum*10 + digit;
            num /= 10;
        }
        if (orgNum == revNum) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

    //function to printPattern
    public void printPattern() {
        System.out.print("Enter number of lines to print rev star pattern: ");
        int inp = sc.nextInt();

        for (int i=inp; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.print("Enter a number to check for prime: ");
        int num = sc.nextInt();

        if(num<=1) {
            System.out.println("It is not a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i=2; i<=(num/2); i++) {
            if (num%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        System.out.print("Enter the size of the Fibonacci series: ");
        int imp = sc.nextInt();

        System.out.print("\nFibonacci Series: " + first + "," + second);

        for (int i = 2; i<imp; i++) {
            int next = first + second;
            System.out.print("," + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    //main method which contains switch and do while loop
    public static void main(String[] args) {

        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("""
                    Enter your choice from below list.
                    1. Find palindrome of number.
                    2. Print Pattern for a given no.
                    3. Check whether the no is a  prime number.
                    4. Print Fibonacci series.
                    --> Enter 0 to Exit.
                    """);
            System.out.println();
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    break;

                case 1: {
                    obj.checkPalindrome();
                }
                break;

                case 2: {
                    obj.printPattern();
                }
                break;

                case 3: {
                    obj.checkPrimeNumber();
                }
                break;

                case 4: {
                    obj.printFibonacciSeries();
                }
                break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}
