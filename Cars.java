class toyota {
    final void displayCarColor() {
        System.out.println("toyotaa carss have seatss ");
    }
}
class wish extends toyota {
    void display() {
        super.displayCarColor();
        System.out.println("wishh hass 7 seatt");
    }
}
public class Cars {
    public static void main(String[] args) {
        wish wish1 = new wish();
        wish1.displayCarColor();
    }
}