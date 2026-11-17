//DiscountService.java

public class DiscountService{


    public void displayText(double Disc, String cType, double amountSaved){
        System.out.println(cType + " customer gets discount of " + Disc+ " coming to a total of " + amountSaved+ " saved.");
    }



  public static void main(String[] args) {
    DiscountService discountService = new DiscountService();
    discountService.calculateDiscount("Regular", 1200);
    discountService.calculateDiscount("Premium", 800);
    discountService.calculateDiscount("Guest", 500);
  }

}   