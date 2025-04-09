package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        //  nakresliPrasatko();


        nakresliOktagon();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKolecko();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliSlunicko();

    }

    public void nakresliPrasatko() {
        telo();

        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(45);

        noha();

        zofka.turnRight(135);
        zofka.move(200);
        zofka.turnRight(135);

        noha();

        ocas();
    }

    // casti prasatka - ukol1
    public void telo() {
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(200);
            zofka.turnRight(90);
        }

        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    public void noha() {
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.penDown();
        zofka.move(50);
    }

    public void ocas() {
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(30);
    }
//cast 2 ukolu - oktagon, kolecko, slunicko
    public void nakresliSlunicko() {
        for(int i =0; i<9;i++) {
            zofka.move(20);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(70);
            zofka.move(20);
            zofka.turnRight(20);
        }


    }

    public void nakresliKolecko () {
        for (int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnRight(20);
        }
    }
    public void nakresliOktagon () {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }


}