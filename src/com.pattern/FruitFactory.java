/**
 * 水果生产类
 */
public class FruitFactory {

    public static Fruit getFruit(String fruitName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //原简单工厂模式写法
//        if(fruitName.equalsIgnoreCase("apple")){
//            return new Apple();
//        }else if(fruitName.equalsIgnoreCase("banana")){
//            return new Banana();
//        }
//        return null;
        //简单工厂模式优化后的代码如下：
       Class cls =  Class.forName(fruitName);
       return (Fruit) cls.newInstance();
    }
}
