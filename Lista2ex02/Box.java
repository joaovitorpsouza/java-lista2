package Lista2ex02;


public class Box {

    private double width;
    private double height;
    private double length;
    
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    
    public double getVolume() {
        return width * height * length;       
    }
}
