package RangeIterator;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        RangeIterator rangeIterator = new RangeIterator(1, 3);

        for ( Object a : rangeIterator){
            System.out.println(rangeIterator.current);
        }

        for ( Object a : rangeIterator){
            System.out.println(rangeIterator.current); // não executa porque o counter está dentro do range Iterator.
        }

        Iterator<Integer> a = IntStream.rangeClosed(0,20).iterator();//faz a mesma cena que o range iterator

        while (a.hasNext()){
            System.out.println(a.next());
        }
        }


}

