package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder withCapitalized = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            if (index == indexToCapitalize) {
                char theCharToUpperCase = str.charAt(indexToCapitalize);
                char correct = Character.toUpperCase(theCharToUpperCase);
                withCapitalized.append(correct);
            } else {
                withCapitalized.append(str.charAt(index));
            }
        }
        return String.valueOf(withCapitalized);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (characterToCheckFor == baseString.charAt(indexOfString)) {
            return true;
        } else {
            return false;
        }
    }

    public static String[] getAllSubStrings(String string) {
        List<String> stringList = new ArrayList<>();
        for (int indexStart = 0; indexStart < string.length(); indexStart++) {
            for (int indexSub = indexStart + 1; indexSub <= string.length(); indexSub++) {
                String newSub = string.substring(indexStart, indexSub);
                stringList.add(newSub);
                }

            }

        List<String> withOutDuplicates = new ArrayList<>(new LinkedHashSet<>(stringList));

        String[] stringArray = withOutDuplicates.toArray(new String [withOutDuplicates.size()]);

        return stringArray;

        }

    public static Integer getNumberOfSubStrings(String input){
    String [] arrayOfStrings = getAllSubStrings(input);
        return arrayOfStrings.length;
    }
}
