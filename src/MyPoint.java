public class MyPoint {
   private int xVal;
   private int yVal;

public int getxVal(){
    return xVal;
}

    public int getyVal(){
        return yVal;
    }

    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }


    public MyPoint(){
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal)
    {
        setxVal(xVal);
        setyVal(yVal);
    }

    public void moveHorizontally(int xVal){
    this.xVal += xVal;
    }

    public  void moveVertically(int yVal){
    this.yVal += yVal;
    }

    public void translate(int x, int y)
    {
        this.xVal+=x;
        this.yVal+=y;
    }


    public double distanceFromOrigin(int xVal, int yVal){
        return Math.sqrt((xVal*xVal)+(yVal*yVal));

    }

    public String toString(){
          return Integer.toString(getxVal())+", "+Integer.toString(getyVal());
    }


}
