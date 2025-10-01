package org.example;

public class Point {


    private  int x;
    private  int y;

    public  Point(int x, int y ){
        this.x=x;
        this.y=y;

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }


    public double distance() {
        return Math.sqrt(x * x + y * y);
    }


    public double distance(Point p) {
        int dx = p.getX() - this.x;
        int dy = p.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}
