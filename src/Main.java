public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int a)
    {
        if(a >= 90)
        {
            return 'A';
        }
        if(a >= 80)
        {
            return 'B';
        }
        if(a >= 70)
        {
            return 'C';
        }
        if(a >= 60)
        {
            return 'D';
        }
        if(a >= 50)
        {
            return 'E';
        }

        return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int a)
    {
        if(a%3 == 0 && a%5 == 0)
        {
            return "fizzbuzz";
        }
        if(a%3 == 0)
        {
            return "fizz";
        }
        if(a%5 == 0)
        {
            return "buzz";
        }
        return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack(String a)
    {
        if(a.length()<2)
        {
            return a;
        }
        String front = a.substring(0,2);

        return front + a + front;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne (int a, int b, int c)
    {
        int ab = a+b;
        int bc = b+c;
        int ac = a+c;
        if(ab == c)
        {
            return true;
        }
        if(bc == a)
        {
            return true;
        }
        if(ac == b)
        {
            return true;
        }
        return false;


    }
    // Question 5 - endUp
    public static String endUp (String a)
    {
        if(a.length()<3)
        {
            return a.toUpperCase();
        }
        String back = a.substring(a.length()-3);

        return a.substring(0, a.length()-3) + back.toUpperCase();
    }
}
