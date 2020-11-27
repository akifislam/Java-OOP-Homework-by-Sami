package Akif;

public class BoxDemo {

    public static void main(String[] args) {

        Box b1 = new Box(15,20.5,10.5);
        Box b2 = new Box(1,4.0,9);

        System.out.println("Volume of Box 1 : " + b1.getVolume());
        System.out.println("Volume of Box 1 : " + b2.getVolume());
    }
}


class Box {
    double length,height,width;

    Box(double l, double h, double w){
        this.length = l;
        this.height = h;
        this.width = w;
    }

    double getVolume() {
        return length*height*width;
    }

}