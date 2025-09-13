public class RelationalOperator {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c=20;
        System.out.println("Number:a=" +a + "Number:b=" +b + "Number:c=" +c);
        System.out.println("--Relational Operators--");
        System.out.println("--Equal to--");
        System.out.println("a==b:" +(a==b));
        System.out.println("--Not Equal to--");
        System.out.println("a!=b:" +(a!=b));
        System.out.println("--Greater than--");
        System.out.println("a>b:" +(a>b));
        System.out.println("--Less than--");
        System.out.println("a<b:" +(a<b));
        System.out.println("--Greater than or Equal to--");
        System.out.println("a>=b:" +(a>=b));
        System.out.println("--Less than or Equal to--");
        System.out.println("a<=b:" +(a<=b));
        System.out.println("--using in condition--");
        if(a==c)
        {
            System.out.println("a and c are equal");
        }
        if(a!=b)
        {
            System.out.println("a and b are not equal");
        }
    }   
    
}
