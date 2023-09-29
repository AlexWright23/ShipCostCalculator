import java.util.Scanner;

//Class itemPrice
//        main()
//        num = 100
//        output "Please enter price of the item $"
//        input itemPrice
//        if itemPrice >= 100 then
//        shippingCost = 0
//        else shippingCost = 0.02 * itemPrice
//        totalPrice = itemPrice + shippingCost
//        output "Your total cost is $ "
//        return
//        endClass

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost;
        double totalPrice;

        if (itemPrice >= 100) {
            shippingCost = 0;

        }

        else {

            shippingCost = 0.02 * itemPrice;
        }

        totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping Cost: $ " + shippingCost);
        System.out.println("Total Cost: $ " +  totalPrice);

    }
}