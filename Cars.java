class toyota {
    final void displayCarColor() {
        System.out.println("toyota cars have seats ");
    }
}
class wish extends toyota {
    void display() {
        super.displayCarColor();
        System.out.println("wish has 7 seats");
    }
}
public class Cars {
    public static void main(String[] args) {
        wish wish1 = new wish();
        wish1.displayCarColor();
    }
}
    

