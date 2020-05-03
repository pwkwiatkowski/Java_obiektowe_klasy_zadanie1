package com.company;

public class Main {

    public static void main(String[] args) {
        Rower RowerPierwszy = new Rower();
        Rower RowerDrugi = new Rower();

        RowerPierwszy.start();
        RowerDrugi.start();

        RowerDrugi.przyspiesz(50);

        RowerPierwszy.wyswietlStan();
        RowerDrugi.wyswietlStan();

        RowerDrugi.stop();

        RowerDrugi.wyswietlStan();
    }
}

class Rower {
    private boolean wRuchu=false;
    private int predkosc=0;

    public void start() {
        wRuchu=true;
        predkosc=0;
    }
    public void stop() {
        wRuchu=false;
        predkosc=0;
    }
    public void przyspiesz(int nowaPredkosc) {
        predkosc=nowaPredkosc;
    }
    public void wyswietlStan() {
        System.out.println("Obecny stan");
        System.out.println("Prędkość wynosi: "+predkosc);
        System.out.println("Czy rower w ruchu: " + (wRuchu ? "Tak" : "Nie") );
    }
}