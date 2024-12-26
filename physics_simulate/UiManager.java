package physics_simulate;

import java.awt.Graphics;

import java.awt.Canvas;
import java.awt.Image;

import javax.swing.JFrame;

public class UiManager extends Canvas{
    private Image offscreenImage; 
    private Graphics offscreenGraphics;
    private String WindowTitle;
    private World world;
    private Ball[] balls;

    public UiManager(World world, Ball[] balls, String WindowTitle) {
        this.world = world;
        this.balls = balls;
        this.WindowTitle = WindowTitle;
        
    }

    @Override
    public void update(Graphics g) {
        // Double buffering: Create an offscreen image for smooth rendering
        if (offscreenImage == null) {
            offscreenImage = createImage(getWidth(), getHeight());
            offscreenGraphics = offscreenImage.getGraphics();
        }

        // Clear the offscreen graphics
        offscreenGraphics.setColor(getBackground());
        offscreenGraphics.fillRect(0, 0, getWidth(), getHeight());

        // Render the scene onto the offscreen graphics
        paint(offscreenGraphics);

        // Draw the offscreen image onto the actual canvas
        g.drawImage(offscreenImage, 0, 0, this);
    }


    @Override
    public void paint(Graphics g) {
      
        world.draw(g);
        for(Ball ball : balls){
            ball.draw(g);
        }
    }


    public void updateBalls() {
        for(Ball ball : balls){
            ball.updatePosition();
        }
        repaint();
    }


    public void createAndShowUI() {
        JFrame frame = new JFrame(WindowTitle);
        frame.add(this);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(world.getSkyColor());
        frame.setVisible(true);

        // Animation loop
        new Thread(() -> {
            while (true) {
                updateBalls();
                try {
                    Thread.sleep(30); // Control the speed of the animation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
