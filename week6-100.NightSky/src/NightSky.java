/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alinaalam
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 1; i <= width; i++) {
            if (density == 1.0) {
                System.out.print("*");
            } else {
                double decision = random.nextDouble(); 
                if (density > decision) {
                    System.out.print("*");
                    starsInLastPrint++;
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 1; i <= height; i++) {
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
