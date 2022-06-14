package ToyMarket;


import java.util.List;


public class Market<T> {

    private List<T> goods;

    public Market(List<T> goods){
        this.goods = goods;
    }

    public T getGoodByIndex(int index){
        return goods.get(index);
    }

//    public int getPriceByInder(int index) {
//        return goods.get(index).price();
//    }

}
