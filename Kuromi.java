package kleber;
import robocode.*;
import java.awt.Color;

/**
 * Kleber - a class by (Kléber Araújo)
 */
public class Kuromi extends Robot {
    public void run() {
		setColors(Color.black,Color.black,Color.black,Color.white,Color.magenta);
		while (true) {
			ahead(100);
		   turnRight(90);
		}	
	}
	//tank robo inimigo detectado
	public void onScannedRobot(ScannedRobotEvent e) {
		String robotank = e.getName();
		double distancia = e.getDistance();
		System.out.println(robotank + " distância " + distancia);
       if (distancia < 135) {
		   fire(3);
	   } else {
		   fire(1);
	   }
	}
	//colisão com a parede
	public void onHitWall(HitWallEvent e) {
		back(50);
       turnRight(90);
	}
}
