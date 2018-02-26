package org.izv.android.game;

import org.izv.android.game.currentgame.Background;
import org.izv.android.game.currentgame.BouncingBall;
import org.izv.android.game.generic.GenericGameActivity;

public class GameActivity extends GenericGameActivity {

    private BouncingBall bouncingBall;

    @Override
    public void paint() {
        super.paint();
    }

    @Override
    public void start() {
        addGameObject(new Background());
        bouncingBall = new BouncingBall();
        addGameObject(bouncingBall);
    }

    @Override
    public void update() {
        super.update();
    }
}