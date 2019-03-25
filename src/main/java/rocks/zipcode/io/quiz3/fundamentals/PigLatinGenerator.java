package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        //get each word
        String[] words = str.split(" ");
        //loop through
        for (int i = 0; i < words.length; i++) {
            //original string
            String word = words[i];
            //new string
            String newWord = null;
            //If the word starts with a vowel, then return the original string with "way" appended
            if (VowelUtils.startsWithVowel(word)) {
                newWord = word + "way";
                // If the word starts with a consonant, then shift consonants from the beginning of the word to the end of the word until the first vowel. Then, return the newly shifted string with "ay" appended.
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == null) {
                    newWord = word + "ay";
                    //If the word has no vowels, then return the original string plus "ay".
                } else {
                    String beginning = word.substring(0, vowelIndex);
                    String ending = word.substring(vowelIndex);
                    newWord = ending + beginning + "ay";
                }
            }
            words[i] = newWord;
        }

//combine words
        return String.join(" ", words);
    }
}
//If the word starts with a vowel, then return the original string with "way" appended
// If the word starts with a consonant, then shift consonants from the beginning of the word to the end of the word until the first vowel. Then, return the newly shifted string with "ay" appended.
//If the word has no vowels, then return the original string plus "ay".
// Vowels are any of the following letters: a, e, i, o, u.
//Consonants are any letter, which aren't a vowel.
