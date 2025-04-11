package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        //nastaveni vychozi pozice
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        //  nakresliPrasatko();


        //  nakresliOktagon();


        // nakresliKolecko();


        //  nakresliSlunicko();

        //ukol cast 3

        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
        }
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(550);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek();
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(110);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliPrasatko();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliDomecek();

        zofka.penUp();
        zofka.move(340);
        zofka.turnLeft(90);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliSlunicko();
    }

    public void nakresliPrasatko() {
        telo();

        zofka.turnRight(135);
        zofka.move(60);
        zofka.turnRight(45);

        noha();

        zofka.turnRight(135);
        zofka.move(80);
        zofka.turnRight(135);

        noha();

        ocas();
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(45);
        zofka.turnRight(90);
        zofka.move(77);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    // casti prasatka - ukol1
    public void telo() {
        for (int i = 0; i < 2; i++) {
            zofka.move(60);
            zofka.turnRight(90);
            zofka.move(80);
            zofka.turnRight(90);
        }

        zofka.turnLeft(45);
        zofka.move(43);
        zofka.turnRight(90);
        zofka.move(43);
    }

    public void noha() {
        zofka.move(20);
        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(135);
        zofka.penDown();
        zofka.move(20);
    }

    public void ocas() {
        zofka.turnRight(45);
        zofka.move(60);
        zofka.turnRight(45);
        zofka.move(20);
    }

    //cast 2 ukolu - oktagon, kolecko, slunicko
    public void nakresliSlunicko() {
        for (int i = 0; i < 9; i++) {
            zofka.move(10);
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.turnRight(180);
            zofka.move(15);
            zofka.turnLeft(70);
            zofka.move(10);
            zofka.turnRight(20);
        }
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.turnLeft(180);
        zofka.penDown();


    }

    public void nakresliKolecko() {
        for (int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnRight(20);
        }
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    public void nakresliOktagon() {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();

    }

    public void nakresliDomecek() {
        for (int i = 0; i < 2; i++) {
            zofka.move(80);
            zofka.turnRight(90);
            zofka.move(60);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(80);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(43);
        zofka.turnRight(90);
        zofka.move(43);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penDown();

    }


}