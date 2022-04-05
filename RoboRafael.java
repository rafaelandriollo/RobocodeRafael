package capacitacao;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * RoboRafael - a robot by Rafael de Carvalho Andriollo
 */
public class RoboRafael extends Robot
{
	/**
	 * run: RoboRafael's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		
		setBodyColor(Color.black);
  		setGunColor(Color.black);
  		setRadarColor(Color.white);
  		setScanColor(Color.white);
		setBulletColor(Color.white);

		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100); //pra frente
			turnGunRight(360);
			back(100); // volta
			turnGunRight(360);
			turnRight(180); //pra trás
			ahead(100); 
			turnGunRight(360);
			turnRight();
			ahead(100);
			ahead(100);
			turnGunRight(360);
			right(100);
			turnGunRight(360);
			left(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		double max = 100;
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(90);
		back(100);
	}
	
	public void onHitRobot(HitRobotEvent e) {
		//quando acertar outro robo
		//tiroFatal(e.getBearing(), e.getEnergy(), getEnergy());		
		//usar tiro mais forte possivel
    	}

	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(90);
		ahead(200);
	}
	public void onWin(WinEvent e) {	
		//quando vitória
     	turnRight(72000);
		//modificar a cor
   	}   
	
}
