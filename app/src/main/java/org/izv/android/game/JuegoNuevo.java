package org.izv.android.game;

import org.izv.android.game.currentgame.Assets;
import org.izv.android.game.currentgame.BouncingBall;
import org.izv.android.game.currentgame.Fondo;
import org.izv.android.game.currentgame.Tiillo;
import org.izv.android.game.generic.GenericGameActivity;

public class JuegoNuevo extends GenericGameActivity {

    private BouncingBall b1,b2;
    private Tiillo t;

    @Override
    public void start() {
        addGameObject(new Fondo());
        b1 = new BouncingBall();
        addGameObject(b1);
        b2 = new BouncingBall();
        b2.setSpeedX(2);
        b2.setSpeedY(3);
        b2.setX(300);
        addGameObject(b2);
        t = new Tiillo();
        addGameObject(t);
    }

    @Override
    public void update() {
        super.update();
        boolean chocan = b1.instersects(b2);
        if (chocan) {
            b1.setImage(Assets.ball2);
            if (b2.getX() < b1.getX()) {
                b1.setSpeedX(b1.getSpeedX());
                b2.setSpeedX(-(b2.getSpeedX()));
            } else {
                b2.setSpeedX(b2.getSpeedX());
                b1.setSpeedX(-(b1.getSpeedX()));
            }
            if (b2.getY() < b1.getY()) {
                b1.setSpeedY(b1.getSpeedY());
                b2.setSpeedY(-(b2.getSpeedY()));
            } else {
                b2.setSpeedY(b2.getSpeedY());
                b1.setSpeedY(-(b1.getSpeedY()));
            }
        }
        chocaPelota(t, b1);
        chocaPelota(t, b2);
    }
    
    private boolean chocaPelota(Tiillo t, BouncingBall b) {
        boolean chocan = t.instersects(b);
        if (chocan) {
            if (t.getX()>b.getX()) {
                b.setSpeedX(-(b.getSpeedX()));
            } else {
                b.setSpeedX(b.getSpeedX());
            }
            if (t.getY()>b.getY()) {
                b.setSpeedY(-(b.getSpeedY()));
            } else {
                b.setSpeedY(b.getSpeedY());
            }
        }
        return chocan;
    }
}
