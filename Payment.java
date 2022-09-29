class Drink {
    String name;
    int price;
    int count;

    Drink(String n, int p, int c){
        name = n;
        price = p;
        count = c;
    }
    int getTotalPrice(){
        return count * price;
    }
    static void printTitle(){
        System.out.println("品名\t\t單價\t數量\t金額");
    }

    void printData(){
        System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
    } 
}

class Alcohol extends Drink{
    float alcper;
    
    Alcohol(String n, int p, int c, float a){
        super(n, p, c);
        alcper = a;
    }
    static void printTitle(){
        System.out.println("品名(度數[%])\t單價\t數量\t金額");
    }
    void printData(){
        System.out.println(name + "(" + alcper + ")" + "\t" + price + "\t" + count + "\t" + getTotalPrice());
    }
}
class Payment{
    public static void main(String[] args) {
        Drink coffee = new Drink("咖啡飲料", 200, 3);
        Drink oolongtea = new Drink("OO烏龍茶", 150, 2);
        Alcohol wine = new Alcohol("葡萄酒", 300, 2, 15.0f);

        Drink.printTitle();
        coffee.printData();
        oolongtea.printData();
        System.out.println();

        Alcohol.printTitle();
        wine.printData();
        int sum = coffee.getTotalPrice() + oolongtea.getTotalPrice() + wine.getTotalPrice();
        System.out.println("\n*** 總計金額 " + sum + "元 ***");
    }
}