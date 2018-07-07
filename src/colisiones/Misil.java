/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colisiones;

public class Misil extends Sprite {

    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;

    public Misil(int x, int y) {
        super(x, y);

        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("misiloriginal.png");
        getImageDimensions();        
    }

    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH)
            vis = false;
    }
}
