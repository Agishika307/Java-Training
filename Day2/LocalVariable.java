public class LocalVariable {
    public void showMessage(){
        String message="Hello ,local Variable";
        System.out.println(message);
    }
    public static void main(String[] args) {
        LocalVariable obj=new LocalVariable();
        obj.showMessage();
    }
    
}
