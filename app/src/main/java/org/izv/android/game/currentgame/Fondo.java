package org.izv.android.game.currentgame;

import org.izv.android.game.generic.GameBackground;

public class Fondo extends GameBackground {

    public Fondo() {
        super(Assets.bk2);
        this.setMovement(Movement.STILL);
    }
}
