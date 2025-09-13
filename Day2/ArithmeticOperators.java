public class ArithmeticOperators {
    public static void main(String[] args)
    {
        int a=100;
        int b=50;
        System.out.println("Number:a=" +a + "Number:b=" +b);
        System.out.println("--Addition--");
        int addResult=a+b;
        System.out.println("a+b=" +addResult);
        System.out.println("--Subtraction--");
        int subResult=a-b;
        System.out.println("a-b=" +subResult);
        System.out.println("--Multiplication--");
        int mulResult=a*b;
        System.out.println("a*b=" +mulResult);
        System.out.println("--Division--");
        float divResult=a/b;
        System.out.println("b/a=" +divResult);
        System.out.println("--Modulus--");
        int modResult=b%a;
        System.out.println("b%a=" +modResult);
        System.out.println("--Increment--");
        a++;
        System.out.println("a++=" +a);
        System.out.println("--Decrement--");
        b--;
        System.out.println("b--=" +b);
        System.out.println("--Pre-Increment--");
        ++a;
        System.out.println("++a=" +a);
        System.out.println("--Pre-Decrement--");
        --b;
        System.out.println("--b=" +b);
    }
}