
public class Main {

    static class MovementMonitor {
        private double shortestDistance;
        int lastX;
        int lastY;

        int curX, curY;

        public MovementMonitor(int initialX, int initialY) {
            this.lastX = initialX;
            this.lastY = initialY;
            this.shortestDistance = Double.NaN;
        }

        public double shortestDistance() {
            return this.shortestDistance;
        }

        public void log(int x, int y)  {
            Double dist = Math.sqrt(Math.pow(x - this.lastX,2) + Math.pow(y - this.lastY, 2));

            this.shortestDistance = dist;
            this.lastX = x;
            this.lastY = y;
        }
    }

    public static void main(String[] args) {

//        System.out.println("Hello World");

        MovementMonitor monitor = new MovementMonitor(23,3);
        double sOne = monitor.shortestDistance();
        monitor.log(29,3);
        double sTwo = monitor.shortestDistance();
        monitor.log(32, 7);
        double sThree = monitor.shortestDistance();
        System.out.printf("%.1f, %.1f, %.1f.\n", sOne, sTwo, sThree);
    }

}
