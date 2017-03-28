package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class SortGo {
    public static void main(String[] args) {
      String[] B={"KTH","JHY"};
        Comparator sc=new StringComparator();
        Sorter.sort(B, sc);

        Integer[] C = {5,9,7,2};
        Comparator integerComp=new IntegerComparator();
        Sorter.sort(C, integerComp);

        for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
        for(int i=0; i<C.length; i++)a
            System.out.println("C["+i+"]="+C[i]);

        WeightTurtle wt30 = new WeightTurtle(30);
        WeightTurtle wt10 = new WeightTurtle(10);
        WeightTurtle wt20 = new WeightTurtle(20);
        WeightTurtle[] wts={wt30, wt10, wt20};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);

        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
    }
}
