package junior.InheritancePlus;

public class Cat extends Animal{
    public String Colar;
    

    public Cat(String name, int age, String Colar) {
        // 因為父類別的建構子有參數需要輸入，所以在子類別的建構子中需要呼叫 super() 並傳入對應的參數
        super(name, age);
        this.Colar = Colar;
    }

    @Override
    public void eat() {
        // super.name 是指父類別的 name 屬性 但是因為已經被繼承所以也是this.name
        System.out.println("Dog-super.name: " + super.name + " is eating.");
        System.out.println("Dog-this.name:  " + this.name + " is eating.");
        System.out.println("Dog-this.Colar:  " + this.Colar + " is eating.");
    }
}
