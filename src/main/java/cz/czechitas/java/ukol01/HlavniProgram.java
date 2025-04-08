package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        zofka.penDown();

        nakresliPrasatko();

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
}



