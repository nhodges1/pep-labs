import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    
    public char recurringChar(String str) {    
        int[] hash_table = new int[256];
        int n = str.length();
        for (int i = 0; i < n; i++)
        {
            hash_table[str.charAt(i)]++;
        }
        int max_count = 0;
        char ans='a';
        for (int i = 0; i < 256; i++)
        {
            if (hash_table[i] > max_count)
            {
                max_count = hash_table[i];
                ans = (char)i;
            }
        }
    return ans;
    }
}

