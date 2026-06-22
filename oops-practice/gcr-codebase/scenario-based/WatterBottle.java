package ioexamples;

public class WatterBottle {
    private static WatterBottle w;
    String name;
    int target;
    WatterBottle(String name, int target){
        this.name=name;
        this.target=target;
    }
     static void displayBottleInfo(WatterBottle w){
        WatterBottle.w = w;
        System.out.println(w.name +" "+ w.target);
    }
    public static void main(String[] args){
        WatterBottle w1=new WatterBottle("Rameshwar", 5);
        WatterBottle w2=new WatterBottle("Himanshu", 3);
        displayBottleInfo(w1);
        displayBottleInfo(w2);
    }
}
