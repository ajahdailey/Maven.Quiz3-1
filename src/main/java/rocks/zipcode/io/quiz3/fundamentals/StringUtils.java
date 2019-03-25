package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
       //get the beginning of string
        String theBeginning = str.substring(0, indexToCapitalize);
       //capitalize character
        Character makeUpperCase = Character.toUpperCase(str.charAt(indexToCapitalize));
       //get ending of string
        String theEnding = str.substring(indexToCapitalize + 1);
        return theBeginning + makeUpperCase + theEnding;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String substring = string.substring(i, j);
                list.add(substring);
            }
        }

        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return (n*(n+1)/2) - 1;

    }
}
