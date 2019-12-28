package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	
	public static void main(String[] args) {
		
		Robot[] r = new Robot[5];
		int add = 75;
		for(int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setSpeed(100);
			r[i].setX(add);
			r[i].setY(550);
			add+=800/r.length;
		}
		
		Thread m1 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				r1.move(75);
				r1.turn(20);
			}
		});

		Random rand = new Random();
		boolean finished = false;
		int winner = 0;
		while(!finished) {
			for(int i =0; i < r.length; i++) {
				if(r[i].getY() > 0) {
					r[i].move(rand.nextInt(50));
				}else {
					winner = i+1;
					finished = true;
					break;
				}
			}
		}
		
		System.out.println("Robot " + winner + " won the race");
		
	}
}
