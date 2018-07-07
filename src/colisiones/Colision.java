/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colisiones;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Margarita
 */
public class Colision extends JFrame {
    
      private ImageIcon icon  = new ImageIcon("/opcionfondo2f.png");
    private JLabel label = new JLabel();

    public Colision() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Tablero());
        add(label);
        
        setResizable(false);
        pack();
        
        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Colision ex = new Colision();
                ex.setVisible(true);
            }
        });
    }

   
}