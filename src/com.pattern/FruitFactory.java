/**
 * 水果生产类
 */
public class FruitFactory {

    public static Fruit getFruit(String fruitName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       Class cls =  Class.forName(fruitName);
       return (Fruit) cls.newInstance();
    }
}
