
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit apple = FruitFactory.getFruit("Apple");//生产苹果
        Fruit banana = FruitFactory.getFruit("Banana");//生产香蕉
        apple.pick();
        banana.pick();
    }
}
