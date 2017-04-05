/*********
  * Compilation: javac RandomPointInCircle.java
  * Execution: java RandomPointInCircle
  * 
  * Prints a point chosen uniformly at random inside the circle centered
  * at (0, 0) and of radius 1.
  * 
  * Uses rejection sampling and a do-while loop.
  * 
  * % java RandomPointInCircle
  * (0.143993993939, 0.8929292929)
  * 
  * % java RandomPointInCircle
  * (-0.6393030404,-0.39304040030)
  */
public class RandomPointInCircle {
    public static void main(String[] args) {
        double x, y;
        do {
            // Scale x and y to be random in (-1, 1).
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x*x + y*y > 1.0);
        
        // print (x, y)
        System.out.println("(" + x + "," + y + ")");
    }
}
