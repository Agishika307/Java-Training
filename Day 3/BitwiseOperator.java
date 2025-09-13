public class BitwiseOperator {
    public static void main(String[] args) {
        int a= 12;
        int b= 10;
        System.out.println("Number:a=" +a + "(binary:" +Integer.toBinaryString(a)+")");
        System.out.println("Number:b=" +b + "(binary:" +Integer.toBinaryString(b)+")");
        System.out.println("--Bitwise And--");
        int andResult=a&b;
        System.out.println("a&b:" +andResult + "(binary:" +Integer.toBinaryString(andResult)+")");
        System.out.println("--Bitwise Or--");
        int orResult=a|b;
        System.out.println("a&b:" +orResult + "(binary:" +Integer.toBinaryString(orResult)+")");
        System.out.println("--Bitwise XOR--");
        int xorResult=a^b;
        System.out.println("a&b:" +xorResult + "(binary:" +Integer.toBinaryString(xorResult)+")");
        System.out.println("--Bitwise NOT--");
        int notResult=~a;
        System.out.println("~a:" +notResult + "(binary:" +Integer.toBinaryString(notResult)+")");
        System.out.println("--shift operation--");
        System.out.println("--Left Shift--");
        int leftShiftResult=a<<2;
        System.out.println("a<<2:" +leftShiftResult + "(binary:" +Integer.toBinaryString(leftShiftResult)+")");
        System.out.println("--Right Shift--");
        int rightShiftResult=a>>2;
        System.out.println("a>>2:" +rightShiftResult + "(binary:" +Integer.toBinaryString(rightShiftResult)+")");
        System.out.println("--Unsigned Right Shift--");
        int unsignedRightShiftResult=a>>>2;
        System.out.println("a>>>2:" +unsignedRightShiftResult + "(binary:" +Integer.toBinaryString(unsignedRightShiftResult)+")");
        System.out.println("--Unsigned Left Shift--");
        int unsignedleftShiftResult=a<<2;
        System.out.println("a<<2:" +unsignedleftShiftResult + "(binary:" +Integer.toBinaryString(unsignedleftShiftResult)+")"); 
 }

}
