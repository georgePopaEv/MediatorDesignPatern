package Chalange;

import java.util.ArrayList;
import java.util.List;

interface Mediator {
    public void addBuyer(Buyer buyer);
    public void findHighestBigger();
}

class AuctionMediator implements Mediator{
    //this class implements the mediator interface and holds all the buyers in
    //an arraylist . We can add buyers and find the highest bidder
    private ArrayList<Buyer> buyerList;

    public AuctionMediator() {
        buyerList = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        this.buyerList.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBigger() {
        int maxBid = 0;
        Buyer winner = null;

        for (Object a: buyerList) {
            Buyer b = (Buyer) a;
            if (b.price > maxBid){
                maxBid = b.price;
                winner = b;
            }

        }

        System.out.println("The auction winner is "+ winner.name +". He paid " + winner.price + "$ for the item.");
        for (Buyer b: buyerList) {
            b.auctionHasEnded();
        }
    }
}
