package junior.inheritance;

public class Bird extends Animal {

    // 在 Dog 類別中覆寫(Override)了 父類別的eat 方法
    @Override
    public void eat() {
        super.eat(); // 呼叫父類別的 eat 方法
        System.out.println("Bird1 is eating.");
    }
}
