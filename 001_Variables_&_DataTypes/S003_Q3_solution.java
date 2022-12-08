import java.util.*;

public class S003_Q3_solution{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of pencil");
        float pencil_price = sc.nextFloat();

        System.out.println("Enter the price of pen");
        float pen_price = sc.nextFloat();

        System.out.println("Enter the price of eraser");
        float eraser_price = sc.nextFloat();

        System.out.println("Hence the total bill is");
        float total = pencil_price + pen_price + eraser_price;
        System.out.println(total);

        //Add-on : after applying 18% gst on total price
        System.out.println("Total bill after applying 18% gst on total price is");
        float gst_total = (total + (0.18f * total));
        System.out.println(gst_total);
    }
}