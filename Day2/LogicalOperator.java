public class LogicalOperator {
public static void main(String[] args) {
        boolean x=true;
        boolean y=false;
        boolean z=true;
        System.out.println("x=" +x + ",y=" +y + ",z="
        +z);
        System.out.println("--Logical Operator--");
       System.out.println("--AND(&&)--");
        boolean result1 = x && y;
        boolean result4 = x && z;
        System.out.println("x && z = " +result4);
        System.out.println("x && y = " +result1);
       System.out.println("--OR(||)--");
        boolean result2 = x || y;
        boolean result5 = y || z;
        System.out.println("y || z = " +result5);
        System.out.println("x || y = " +result2);
        System.out.println("--NOT(!)--");
        boolean result3 = !x;
        boolean result6 = !y;
        System.out.println("!y = " +result6);
        System.out.println("!x = " +result3);
    }
}
