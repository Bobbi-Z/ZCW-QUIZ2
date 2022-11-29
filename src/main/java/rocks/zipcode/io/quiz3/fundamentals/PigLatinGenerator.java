package rocks.zipcode.io.quiz3.fundamentals;


import org.apache.commons.lang3.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
   private String str;
   private Integer firstVowel;

    public Integer checkingFirstLetter(String str){
        char firstLetter = str.charAt(0);
        String firstLetterString = String.valueOf(firstLetter);
        boolean isAVowel = StringUtils.containsAnyIgnoreCase(firstLetterString,
                "a", "e", "i", "o", "u");
        if (isAVowel == true){
            return 1;
        }else{
            return 2;
        }
    }

    public Integer findFirstVowel(String str){
        int firstVowel =   StringUtils.indexOfAny(str, "a", "e", "i", "o", "u");
        //   (str, "a", "e", "i", "o", "u");
        if (firstVowel > 0){
            return firstVowel;
        }
        return -1;
    }

    public String createSubStringBeginning(String str, int firstVowel) {
        String subOne = StringUtils.substring(str, 0, firstVowel);
        return subOne;
    }

    public String createSubStringEnd(String str, int firstVowel){
        String subTwo = StringUtils.substring(str, firstVowel, str.length());
        return subTwo;
    }


    public String translate(String str) {
      StringBuilder pigLatin = new StringBuilder();
           switch (checkingFirstLetter(str)){
               case 1:
                   pigLatin.append(str + "way");
                   return String.valueOf(pigLatin);
               case 2:
                  int firstVowel = findFirstVowel(str);
                   if (firstVowel != -1 ){
                       createSubStringBeginning(str, firstVowel);
                       createSubStringEnd(str, firstVowel);
                       pigLatin.append(createSubStringEnd(str, firstVowel) + createSubStringBeginning(str, firstVowel) + "ay");
                       return String.valueOf(pigLatin);
                   }else{
                       pigLatin.append(str + "ay");
                       return String.valueOf(pigLatin);
                   }
           }
           return "null";
    }



}
