package edu.gcccd.csis;
import java.util.*;
public class PIapproximation {

    public static void main (String[] args){
        double drops;
        System.out.println("this application approximate the value of Pi");
        System.out.println("The approximation is proportional to the number of points taken inside the circle divided by points outside the circle");
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of points >> ");
        drops = input.nextDouble();
        double pi = approx(drops);
        System.out.println("Pi is " + pi);
        System.out.println("The approximation difference is " + (Math.PI - pi));

    }
    public static double approx(double drops) {
        final Random random = new Random(System.currentTimeMillis());
        double inside = 0;
        for (double k = 1; k <= drops; k++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if ((Math.sqrt((x * x) + (y * y))) < 1) {
                inside++;
            }
        }
        return (4 * (inside / drops));
    }
}