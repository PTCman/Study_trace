package ch7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i%10 + 1;
            cards[i] = new SutdaCard(num, false);
            if(i ==0 || i==2 || i==7){
                cards[i].isKwang = true;
            }
        }
    }

    void shuffle(){
        for(int i = 0;i<CARD_NUM;i++){
            int ran_num = (int) (Math.random()* cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[ran_num];
            cards[ran_num] = tmp;
        }
    }
    SutdaCard pick(int index){
        if(index<0 || index >= CARD_NUM){
            return null;
        }
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int) (Math.random()* cards.length)];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
