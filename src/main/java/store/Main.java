package store;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Goods milk = new Goods(67);
        Goods cake = new Goods(98);
        Goods cheese = new Goods(77);
        Goods bread = new Goods(45);
        Goods cookie = new Goods(76);
        Goods yoghurt = new Goods(81);

        //Сперва я использовал два класса Shelves и StoreHall, но т.к. они имелют,
        //по сути, идентичные методы и массив, для избегания повторений кода, я сделал для них общий класс Accounting

        Accounting shelve1 = new Accounting();
        shelve1.collection = Arrays.asList(milk, cheese, yoghurt);
        Accounting shelve2 = new Accounting();
        shelve2.collection = Arrays.asList(bread, cake, cookie);
        Accounting shop = new Accounting();
        shop.collection = Arrays.asList(shelve1, shelve2);
        System.out.println(shop.priceCalculator());


//        Shelves shelve1 = new Shelves();
//        shelve1.goodsList = Arrays.asList(milk, cheese, yoghurt);
//        Shelves shelve2 = new Shelves();
//        shelve2.goodsList = Arrays.asList(cake, bread, cookie);
//        StoreHall shop = new StoreHall();
//        shop.everythingWeHave= Arrays.asList(shelve1, shelve2);
//        System.out.println(shop.priceCalculator());




    }
}
