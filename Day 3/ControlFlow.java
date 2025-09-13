public class ControlFlow{
    public static void main(String[] args) {
        System.out.println("Control Flow Statements in Java");
   System.out.println("Loops and Jump Statements"); 
   System.out.println("1. for loop");
   for(int i=1;i<=5;i++){
       System.out.println("Iteration: "+i);
    System.out.println("2. while loop");
    int j=1;
    while(j<=5){
        System.out.println("Iteration: "+j);
        j++;
    }
    System.out.println("3. do-while loop");
    int k=1;
    do{
        System.out.println("Iteration: "+k);
        k++;
    }while(k<=5);
    System.out.println("Jump Statements");
    System.out.println("4. break statement");
    System.out.println("Finding first 5 even numbers:");
    for(int n=1;n<=10;n++){
        if(n%2==0){
            System.out.println(n);
        }
        if(n==10){
            break;
        }
    }
    System.out.println("5. continue statement");
    System.out.println("Finding even numbers between 1 to 10:");
    for(int m=1;m<=10;m++){ 
        if(m%2!=0){
            continue;
        }
        System.out.println(m);
    }
    System.out.println("6. return statement");
    if (true){
        System.out.println("Exiting the main method using return statement.");
        return;
    }
    System.out.println("This line will not be executed.");
}
    }
}