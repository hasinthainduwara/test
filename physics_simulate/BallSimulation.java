package physics_simulate;

import java.awt.Color;

public class BallSimulation  {
    

    public static void main(String[] args) {


        World Earth = new World(9.8, 700, 400, 800, Color.GREEN, Color.BLACK); 

        Ball ball1 = new Ball(Earth, 100, 300, 20, 1.0,Color.RED);
        Ball ball2 = new Ball(Earth, 200, 300, 40, 2.0,Color.BLUE);
       
        


        UiManager uiManagerEarth = new UiManager(Earth, new Ball[] {ball1,ball2}, "Earth Simulation");
        uiManagerEarth.createAndShowUI();




    }
}

