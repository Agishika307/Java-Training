public class InstanceVariable {

    int value=10;
    public static void main(String[] args)
    {
        InstanceVariable obj1=new InstanceVariable();
        InstanceVariable obj2= new InstanceVariable();
        obj2.value=30;
        System.out.println("obj1 value:"+obj1.value);
        System.out.println("Obj2 value:"+obj2.value);
    }
}
