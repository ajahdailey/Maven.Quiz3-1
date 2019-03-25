package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        //loop through
        for(SomeType type : array){
            //if type is odd
            if(getNumberOfOccurrences(type) % 2 == 1){
                return type;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        //loop through
        for(SomeType type : array){
            //if type is even
            if(getNumberOfOccurrences(type) % 2 == 0){
                return type;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
       //need counter, start at zero
        int counter = 0;
        //loop through
        for(SomeType type : array){
            //if the value = type
            if(valueToEvaluate.equals(type)){
               //add to counter
                counter++;
            }

        }

        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        //a list of 'some type'.
        List<SomeType> filter = new ArrayList<>();
        //loop through
        for(SomeType type : array){
            //apply predicate to type
            if (predicate.apply(type)){
                filter.add(type);
            }
        }

        SomeType[] newArray = Arrays.copyOf(array, filter.size());

        return filter.toArray(newArray);
    }
}
