package capacitacao;
import robocode.*;
import java.awt.Color;

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
		
		setColors(Color.black,Color.black,Color.white);
  		setScanColor(Color.white);
		setBulletColor(Color.white);
		


		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100); //pra frente
			turnGunRight(360);
			turnRight(180); // volta
			ahead(100); 
			turnGunRight(360);
			
			turnRight(180); //pra trás
			ahead(100); 
			turnGunRight(360);
			turnRight(180); // volta
			ahead(100); 
			turnGunRight(360);
			
			turnRight(90); //esquerda
			ahead(100); 
			turnGunRight(360);
			turnRight(180); // volta
			ahead(100); 
			turnGunRight(360);
			
			turnRight(180); //direita
			ahead(100);
			turnGunRight(360);
			turnRight(180); //volta
			ahead(100); 
			turnGunRight(360);
		}
	}
	


	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		//double max = 100;
			// If the other robot is close by, and we have plenty of life,
		// fire hard!
		if (e.getDistance() < 50 && getEnergy() > 50) {
			fire(3);
		} // otherwise, fire 1.
		else {
			fire(1);
		}
		// Call scan again, before we turn the gun
		scan();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(90 - e.getBearing());
	}
	
	public void onBulletHit(BulletHitEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}
	
	public void onHitRobot(HitRobotEvent e) {
		//quando acertar outro robo
		tiroForte(e.getBearing(), e.getEnergy(), getEnergy());	
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
     	turnRight(36000);
		
   	}   

	public void tiroForte(double PosIni, double energyIni, double energiaRobo) {
		//tiro com mais força
		double posicao = getHeading() + PosIni - getGunHeading();
		double tiro = (energyIni / 4) + .1;

		if (!(posicao > -80 && posicao <= 180)) {
			while (posicao <=-180)
				posicao += 360;
			while (posicao > 180)
				posicao -=360;
		}

		turnGunRight(posicao);
		fire(tiro);
			
	}
	
}
