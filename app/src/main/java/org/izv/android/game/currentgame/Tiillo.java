package org.izv.android.game.currentgame;

import org.izv.android.game.generic.GameObject;

public class Tiillo extends GameObject {

    private static final int MAXSALTO = 15;

    private boolean saltando = false;
    private int salto = 0;

    public Tiillo() {
        super(Assets.stand);
        this.setX(350);
        this.setY(260);
    }

    @Override
    public void update() {
        if (getTouchHandler().isMoving() && getTouchHandler().isMovingUp()) {
            if (!saltando) {
                salto = -MAXSALTO;
                setSpeedY(salto);
                saltando = true;
            }
        }
        if (getTouchHandler().isMoving() && getTouchHandler().isMovingDown()) {
            this.setImage(Assets.ducking);
        }
        if (getTouchHandler().isMoving() && getTouchHandler().isMovingLeft()) {
            this.setSpeedX(-10);
        }
        if (getTouchHandler().isMoving() && getTouchHandler().isMovingRight()) {
            this.setSpeedX(10);
        }
        if (saltando) {
            setY(getY() + getSpeedY());
            setX(getX() + getSpeedX());
            if (getSpeedX() > 0) {
                this.setImage(Assets.jumpingright);
            } else {
                this.setImage(Assets.jumpingleft);
            }
            setSpeedY(getSpeedY() + 1);
            salto++;
            if (salto > MAXSALTO) {
                saltando = false;
                setSpeedY(0);
                this.setImage(Assets.stand);
            }
        }
        if (this.getX() > this.getGraphics().getWidth() - this.getImage().getBitmap().getWidth() || this.getX() < 0) {
            this.setSpeedX(-this.getSpeedX());
        }
    }
}
