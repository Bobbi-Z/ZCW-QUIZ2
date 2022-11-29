package rocks.zipcode.io.quiz3.fundamentals;

import org.apache.commons.lang3.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        return StringUtils.containsAnyIgnoreCase(word, "a", "e", "i", "o", "u");
    }

    public static Integer getIndexOfFirstVowel(String word) {

        return StringUtils.indexOfAny(word, "a", "e", "i", "o", "u");
    }


    public static Boolean startsWithVowel(String word) {
      char isAVowel =  word.charAt(0);
        return hasVowels(String.valueOf(isAVowel));
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(String.valueOf(character));
    }
}
