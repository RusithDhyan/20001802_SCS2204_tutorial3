object main extends App{

    //The total amount for 60 books
    def bookPrice(x:Int):Double=x*24.95;

    //For Discount
    def discount(amount:Double):Double=amount*0.4;
    
    // For Shipping Cost
    def shippingCost(x:Int):Double=3*x+(x-50)*0.75;

    //The total wholesale cost for 60 books...

    var cost = bookPrice(60)-discount(bookPrice(60))+shippingCost(60);

    println("The total wholesale cost is:" + cost);
    
}