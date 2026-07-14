package junior.domo;

public class CDemo {
    public static void main(String[] args) {
        
        Car car1 = new Car();

        car1.brand ="BMW";
        car1.colar ="Blue";
        car1.year=2022;
        car1.numberPlate="BMW-5888";

        System.out.println("車子的品牌:" + car1.brand);

        car1.start();
        car1.stop();



        Area area1 = new Area(5, 3);
        int areaResult =area1.calculateArea();
        System.out.println("長方形的面積為: " + areaResult);



        double area1Resut= area1.calculateArea(5,7,3);
        System.out.println("梯形面積"+area1Resut);





    }
   
}
