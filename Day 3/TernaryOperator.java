public class TernaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int max=(a>b)?a:b;
        System.out.println("a="+a+",b="+b);
        System.out.println("Max value is:"+max);
        int maxUsingIf;
        if(a>b){
            maxUsingIf=a;
        }else{
            maxUsingIf=b;
        }
        System.out.println("Max value using if is:"+maxUsingIf);
        
    }
    
}
