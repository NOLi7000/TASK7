class toyota {
    final void displayCarColor() {
        System.out.println("toyotaa carss have seats ");
    }
}
class wish extends toyota {
    void display() {
        super.displayCarColor();
        System.out.println("wishh has 7 seat");
    }
}
public class Cars {
    public static void main(String[] args) {
        wish wish1 = new wish();
        wish1.displayCarColor();
    }
}