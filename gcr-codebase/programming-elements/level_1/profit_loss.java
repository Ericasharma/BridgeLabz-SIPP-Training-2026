public class profit_loss {
    public static void main(String [] args){
        int cost=129;
        int sell=191;
        int profit=sell-cost;
        double profitPercentage=(profit/cost)*100;
        System.out.println("The cost price is: "+cost+" and the selling price is: "+sell);
        System.out.println("The profit is: "+profit+" and the profit percentage is: "+profitPercentage);
    }
}
