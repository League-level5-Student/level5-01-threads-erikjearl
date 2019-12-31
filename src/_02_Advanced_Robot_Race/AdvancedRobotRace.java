package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static boolean finished = false;
	
	public static void main(String[] args) {
		
		Robot h = new Robot(0,50);
		h.setSpeed(5000);
		h.penDown();
		h.setPenColor(Color.red);
		h.turn(90);
		h.move(1500);
		
		Robot[] r = new Robot[5];
		int add = 75;
		for(int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setSpeed(1);
			r[i].setX(add);
			r[i].setY(550);
			add+=800/r.length;
		}
		
		Random rnd = new Random();
		Random rand = new Random(rnd.nextInt());
		
		
		int num = 10;
		Thread m0 = new Thread(()->{
			while(r[0].getY() > 50 && !finished) {
				r[0].move(rand.nextInt(num));
				System.out.println("0" + r[0].getY());
			}
			if(!finished) {
				System.out.println("Robot " + 0 + " won the race");
				finished = true;
			}
		});
		
		Thread m1 = new Thread(()->{
			while(r[1].getY() > 50 && !finished) {
				r[1].move(rand.nextInt(num));
				System.out.println("1" + r[0].getY());
			}
			if(!finished) {
				System.out.println("Robot " + 1 + " won the race");
				finished = true;
			}
		});
		
		Thread m2 = new Thread(()->{
			while(r[2].getY() > 50 && !finished) {
				r[2].move(rand.nextInt(num));
				System.out.println("2" + r[0].getY());
			}
			if(!finished) {
				System.out.println("Robot " + 2 + " won the race");
				finished = true;
			}
		});
		
		Thread m3 = new Thread(()->{
			while(r[3].getY() > 50 && !finished) {
				r[3].move(rand.nextInt(num));
				System.out.println("3" + r[0].getY());
			}
			if(!finished) {
				System.out.println("Robot " + 3 + " won the race");
				finished = true;
			}
		});
		
		Thread m4 = new Thread(()->{
			while(r[4].getY() > 50 && !finished) {
				r[4].move(rand.nextInt(num));
				System.out.println("4" + r[0].getY());
			}
			if(!finished) {
				System.out.println("Robot " + 4 + " won the race");
				finished = true;
			}
		});
			
		m0.start();
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
		
		
	}
}
