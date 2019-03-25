package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        //make all lowercase first
        str = str.toLowerCase();
        List<String> list = new ArrayList<>();

        //go through string
        for(int i = 0; i < str.length(); i++) {
            //if letter = character, capitalize
            if (Character.isLetter(str.charAt(i))) {
                String c = StringUtils.capitalizeNthCharacter(str, i);
                list.add(c);
            }
        }

        String[] newArray = new String[list.size()];

        return list.toArray(newArray);
    }


}
