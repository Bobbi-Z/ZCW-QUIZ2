package rocks.zipcode.io.quiz3.arrays;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        ArrayList<String> waveList = new ArrayList<>();
      char current;
      str = StringUtils.lowerCase(str);
        for (int indexS = 0; indexS < str.length(); indexS++) {
            current = str.charAt(indexS);
            String charToCapitalize = String.valueOf(current);
            if (!StringUtils.isAlpha(charToCapitalize)) {
                continue;
            }
                charToCapitalize = StringUtils.upperCase(charToCapitalize);
                char currentCap = charToCapitalize.charAt(0);


                waveList.add(newStr);
               str = StringUtils.lowerCase(str);

            }
        String [] waveArray = new String[waveList.size()];
        waveList.toArray(waveArray);
        return waveArray;
        }

    }
