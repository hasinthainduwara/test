package physics_simulate;

import java.awt.Color;
import java.awt.Graphics;

class World {
    private double gravity;
    private int groundLevel;
    private int groundHeight;
    private int groundWidth;
    private Color groundColor;
    private Color skyColor;

    public World(double gravity, int groundLevel, int groundHeight, int groundWidth,Color groundColor,Color skyColor) {
        this.gravity = gravity;
        this.groundLevel = groundLevel;
        this.groundHeight = groundHeight;
        this.groundWidth = groundWidth;
        this.groundColor = groundColor;
        this.skyColor = skyColor;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public Color getGroundColor() {
        return groundColor;
    }

    public void setGroundColor(Color groundColor) {
        this.groundColor = groundColor;
    }

    public int getGroundLevel() {
        return groundLevel;
    }

    public Color getSkyColor() {
        return skyColor;
    }

   public void draw(Graphics g) {
        g.setColor(groundColor);
        g.fillRect(0, groundLevel, groundWidth, groundHeight); 
    }
}
