//DiscountService.java

public class DiscountService {


public void displayText(double Disc, String cType, double amountSaved){
        System.out.println(cType + " customer gets discount of " + Disc+ " coming to a total of " + amountSaved+ " saved.");
    }

public boolean pChecker(double purchaseAmount){
    if(purchaseAmount > 1000){
        return true;
    }else{
        return false;
    }
}

public int customerType(String customerType){
    switch(customerType){
        case "Premium":
            return 0;
        case "Regular":
            return 1;
        case "Guest":
            return 2;
    }
    return 10;
}

public double discountValue(String customerType, double purchaseAmount){

    int tempCT = customerType(customerType);
    boolean purchaseValue = pChecker(purchaseAmount);

    if(tempCT == 0 && purchaseValue == true ){
        return 0.2;
    }else if(tempCT == 0 && purchaseValue == false){
        return 0.1;
    }
    else if(tempCT == 1 && purchaseValue == true){
        return 0.1;
    }
    else if(tempCT == 1 && purchaseValue == false){
        return 0.05;
    }else if(tempCT == 10){
        throw new IllegalArgumentException("strange customer type");
    }else{
        return 0.0;
    }
}

public double amountSaved1(double disc, double purchaseAmount){
    double amountSaved = purchaseAmount * disc;
    return amountSaved;
}
    

  public void calculateDiscount(String customerType, double purchaseAmount){

    double disc = discountValue(customerType, purchaseAmount);
    double amountSaved2 = amountSaved1(disc, purchaseAmount);
    displayText(disc, customerType, amountSaved2);
  }

  public static void main(String[] args) {
    DiscountService discountService = new DiscountService();
    discountService.calculateDiscount("Regular", 1200);
    discountService.calculateDiscount("Premium", 800);
    discountService.calculateDiscount("Guest", 500);
  }

}