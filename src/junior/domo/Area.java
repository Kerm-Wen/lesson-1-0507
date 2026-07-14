package junior.domo;

public class Area {
    public int length;
    public int width;
    public int calculateArea(){
        int area = length* width;
        return area;
    }
    public Area(int length,int width){
        this.length=length;
        this.width=width;
    
    
    }
    public double calculateArea(int r){
        double area =r*r*3.14;
        return area;
    }
    public double calculateArea(int base, int height) {
        double area = (base * height) / 2.0;
        return area;
    }

    public double calculateArea(int topBase, int bottomBase, int height){
        double area1=(topBase+bottomBase)*height/2;
        return area1 ;

    }
}






