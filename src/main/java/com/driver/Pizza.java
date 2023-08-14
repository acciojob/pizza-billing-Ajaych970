package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPriceNonVeg;
    private int paperbagPrice;
    private  boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;
    private int extraToppingPriceVeg;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            this.price=300;
            //this.extraToppingPriceVeg=70;
            this.basePrice=300;
        }else {
            this.basePrice=400;
           // this.extraToppingsPriceNonVeg=120;
            this.price=400;
        }
        this.extraToppingsPriceNonVeg=120;
        this.extraToppingPriceVeg=70;
        this.extraCheesePrice=80;
        this.paperbagPrice=20;
        //this.price=this.basePrice;

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (this.isExtraCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            isExtraCheeseAdded=true;
        }

        }

    public void addExtraToppings(){
        // your code goes here
        if(this.isExtraToppingsAdded==false && isVeg==true ){
            this.price=this.price+this.extraToppingPriceVeg;
            this.isExtraToppingsAdded=true;
        } else if (this.isExtraToppingsAdded==false && isVeg==false) {
            this.price=this.price+this.extraToppingsPriceNonVeg;
            this.isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isPaperBagAdded==false){
            this.price=this.price+this.paperbagPrice;
            this.isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        //if(this.isBillGenerated==false){
            this.bill="Base Price Of The Pizza: "+this.basePrice+"\n";
            if(this.isExtraCheeseAdded==true){
                this.bill+="Extra Cheese Added: "+this.extraCheesePrice +"\n";
            }
            if(this.isExtraToppingsAdded==true && isVeg==true){
                this.bill += "Extra Toppings Added: "+this.extraToppingPriceVeg+"\n";
            }
            else if(this.isExtraToppingsAdded==true && isVeg==false){
                this.bill += "Extra Toppings Added: "+this.extraToppingsPriceNonVeg+"\n";
            }
            if(this.isPaperBagAdded==true){
                this.bill +="Paperbag Added: "+this.paperbagPrice+"\n";
            }
            this.bill +="Total Price: "+this.price+"\n";
            //this.isBillGenerated=true;
       // }
        return this.bill;

    }
}
