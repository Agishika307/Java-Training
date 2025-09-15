public class Constructor {
    int id;
    String name;
    Constructor() {
        this.id = 100;
        this.name = "John";
    }
    Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(200, "Alice");

        obj1.display(); // Output: ID: 100, Name: John
        obj2.display(); // Output: ID: 200, Name: Alice
    }
    
}
