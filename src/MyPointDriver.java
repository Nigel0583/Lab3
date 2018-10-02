

public class MyPointDriver {
        public static void main (String[] args){
            MyPoint points = new MyPoint(5, 9);

            points.moveHorizontally(4);
            points.moveVertically(1);

            System.out.println(points.toString());

            points.translate(8,4);
            System.out.println(points.toString());

            System.out.println(points.distanceFromOrigin(points.getxVal(),points.getyVal()));




        }
    }

