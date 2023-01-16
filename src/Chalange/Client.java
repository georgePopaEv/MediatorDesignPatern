package Chalange;

public class Client {
    public static void main(String[] args) {
        AuctionMediator med = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(med, "George");
        Buyer b2 = new AuctionBuyer(med, "Razvan");
        Buyer b3 = new AuctionBuyer(med, "Alina");

        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas");
        System.out.println("------------------------------------------------");

        System.out.println("Waiting for the buyer's offers...");

        //Making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("------------------------------------------------");
        med.findHighestBigger();

        b2.cancelTheBid();
        System.out.println(b2.name + " Has canceled his bid!, in that case");
        med.findHighestBigger();
    }
}
