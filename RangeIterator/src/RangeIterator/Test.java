package RangeIterator;

import java.util.ArrayList;

public class Test {
    private Test(){

    }

    public static void main(String[] args) {
    selectRangeAndExpectToReturnAllNumberIncludingMaxAndMin();
    inputMaxMinInsteadOfMinMaxAndExpectToRecognizeMinAndMax();
    expectCurrentToReturnTheDifferenceBetweenMaxAndMin();
    IterateOneTimeAndExpectCurrentToEqualMinPlusOne();
    }


   private static void selectRangeAndExpectToReturnAllNumberIncludingMaxAndMin(){
        RangeIterator iterator = new RangeIterator(1, 5);
        ArrayList<Integer> i = new ArrayList<Integer>();
        for (Object num : iterator){
            i.add((Integer) num);
        }

       if(!i.contains(1)) {
           throw new RuntimeException("The range must include the min value");
       }
       if(!i.contains(5)){
           throw new RuntimeException("The range must includ the max value");
       }
       }

       private static void inputMaxMinInsteadOfMinMaxAndExpectToRecognizeMinAndMax(){
        RangeIterator iterator = new RangeIterator(10,1);
        if(iterator.max != 10){
            throw new RuntimeException("The max value has to be 10, your is " + iterator.max);
        }
        if(iterator.min != 1){
            throw new RuntimeException("The min has to be 1 and not, " + iterator.min);
        }
       }

       private static void expectCurrentToReturnTheDifferenceBetweenMaxAndMin(){


        RangeIterator iterator = new RangeIterator(1,4);
        for(Object num : iterator){
            //test;
        }
        if(iterator.current - 1 != (iterator.max)- iterator.min){
            System.out.println(iterator.current);
            System.out.println(iterator.max- iterator.min);
            System.out.println("The value of the current at the final iteration needs to be = to max - min");
        }
       }

       private static void IterateOneTimeAndExpectCurrentToEqualMinPlusOne(){
        RangeIterator iterator = new RangeIterator(10,1);
        iterator.iterator().next();
        if (iterator.current + 1 != 2){
            System.out.println("Needs no be 2");
        }
       }
   }



