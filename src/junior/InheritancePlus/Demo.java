package junior.InheritancePlus;

public class Demo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("初始動物1", 5);
        animal1.eat();
        System.out.println("-----------------------------");
        Dog dog1 = new Dog("旺財", 3, "拉布拉多");
        dog1.eat();

      
    }

}
