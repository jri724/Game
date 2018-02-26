package org.izv.android.game.currentgame;

import org.izv.android.game.media.Graphics;
import org.izv.android.game.media.Image;

public class Assets {

    public static Image background, ball, ball2, bk2, jump, right, stand, ducking, left, jumpingleft, jumpingright;

    public static void load(Graphics g) {
        Assets.background = g.newImage("background.jpg");
        Assets.bk2 = g.newImage("bk2.jpg");
        Assets.ball = g.newImage("ball.png");
        Assets.ball2 = g.newImage("ball2.png");
        Assets.jump = g.newImage("jump.png");
        Assets.right = g.newImage("right.png");
        Assets.stand = g.newImage("stand.png");
        Assets.ducking = g.newImage("ducking.png");
        Assets.left = g.newImage("left.png");
        Assets.jumpingleft = g.newImage("jumpingleft.png");
        Assets.jumpingright = g.newImage("jumpingright.png");
    }
}