package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        //return true if word contains a, e, i, o, or u.
        char[] letters = word.toCharArray();

        for(int i =0; i<letters.length; i++){
            char character = letters[i];

            if(isVowel(character)){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        //return the index of the first vowel occurring in word
        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            char character = letters[i];

            if (isVowel(character)) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        //return true if first character of word is a vowel
        char[] letters = word.toCharArray();
        char firstLetter = letters[0];

        return isVowel(firstLetter);
    }

    public static Boolean isVowel(Character character) {
       //return true if character is a, e, i, o, or u
        Character[] vowels = new Character[]{'a','e','i','o','u'};

        for(int i =0; i< vowels.length; i++){
            Character vowel = vowels[i];

            if(character.toString().equalsIgnoreCase(vowel.toString())){
                return true;
            }

        }


        return false;
    }
}
