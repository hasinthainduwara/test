package physics_simulate;


import java.awt.Graphics;
import java.awt.Color;

public class Ball {

    private int x, y, diameter;
    private double mass;
    private double velocityY;
    private double accelerationY; 
    private World world;
    private Color color;

    public Ball(World world, int x, int y, int diameter, double mass, Color color) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.mass = mass;
        this.velocityY = 0;
        this.color = color;
        this.accelerationY = world.getGravity(); 
    }

    public void updatePosition() {
        velocityY += accelerationY / 30; // Update velocity with acceleration (scaled for frame rate)
        y += velocityY; // Update position

        // Simulate bounce when hitting the ground
        if (y + diameter > world.getGroundLevel()) { // Assuming ground at y = 400
            y = world.getGroundLevel() - diameter;
            double dampingFactor = 0.7; // Default damping factor
            // Adjust damping factor based on mass
            velocityY = -velocityY * (dampingFactor * (1 / mass)); // Heavier balls bounce less
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }
}