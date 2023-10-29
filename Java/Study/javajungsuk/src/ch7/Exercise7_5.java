package ch7;

class Product1
{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수
    Product1(){}
    Product1(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv1 extends Product1 {
    Tv1() {}
    public String toString() {
        return "Tv";
    }
}
public class Exercise7_5 {
    public static void main(String[] args) {
        Tv1 t = new Tv1();
    }
}
