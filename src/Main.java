import models.Orders;
import models.T_shirt;

public class Main {
    public static void main(String[] args) {
        String[] sizes1 = {"XL", "Medium", "Large"};
        T_shirt tshirt1 = new T_shirt("Gorkhali Batman", 571, 1235, "Karuna", "Graphic text: You either die a hero or live long enough to see yourself be a villain", sizes1);
        tshirt1.description();

        String[] sizes2 = {"XL", "Medium", "Large"};
        T_shirt tshirt2 = new T_shirt(" American shirt", 542, 4350, "Nike", "Graphic text:Feel Good, Do Good", sizes2);
        tshirt2.description();

        String[] sizes3 = {"XL", "Medium", "Large"};
        T_shirt tshirt3 = new T_shirt("Hello kitty", 577, 5230, "Miniso", "Graphic text:Hello Kitty", sizes3);
        tshirt3.description();



        int[] order1Codes = {tshirt1.getProduct_code(), tshirt2.getProduct_code()};
        double[] order1Prices = {tshirt1.getPrice(), tshirt2.getPrice()};
        Orders ord1 = new Orders("Gopal Sharma", 4867564, order1Codes, order1Prices);
        ord1.bill_generator();

        int[] order2Codes = {tshirt2.getProduct_code(), tshirt3.getProduct_code()};
        double[] order2Prices = {tshirt2.getPrice(), tshirt3.getPrice()};
        Orders ord2 = new Orders("Sita Sharma", 98524157, order2Codes, order2Prices);
        ord2.bill_generator();

        int[] order3Codes = {tshirt3.getProduct_code(), tshirt1.getProduct_code()};
        double[] order3Prices = {tshirt3.getProduct_code(), tshirt1.getProduct_code()};
        Orders ord3 = new Orders("Ram Sapkota", 98451232, order3Codes,order3Prices);
        ord3.bill_generator();
    }
}