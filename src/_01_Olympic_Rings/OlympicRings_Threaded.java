package _01_Olympic_Rings;

import java.awt.Color;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r1 = new Robot(150, 300);
		Robot r2 = new Robot(400, 600);
		Robot r3 = new Robot(600, 300);
		Robot r4 = new Robot(850, 600);
		Robot r5 = new Robot(1050, 300);
		
		r1.setSpeed(10);
		r1.penDown();
		r2.setSpeed(10);
		r2.penDown();
		r3.setSpeed(10);
		r3.penDown();
		r4.setSpeed(10);
		r4.penDown();
		r5.setSpeed(10);
		r5.penDown();
		
		r1.penDown();
		
		
		Thread m1 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				r1.setPenColor(Color.red);
				r1.move(75);
				r1.turn(20);
			}
		});
		
		Thread m2 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				r2.setPenColor(Color.blue);
				r2.move(75);
				r2.turn(20);
			}
		});
		
		
		Thread m3 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				r3.setPenColor(Color.green);
				r3.move(75);
				r3.turn(20);
			}
		});
		
		Thread m4 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				r4.setPenColor(Color.black);
				r4.move(75);
				r4.turn(20);
			}
		});
		
		Thread m5 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				r5.setPenColor(Color.yellow);
				r5.move(75);
				r5.turn(20);
			}
		});
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
	}
}

