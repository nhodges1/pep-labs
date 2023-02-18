import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.LinkedHashMap;
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

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char key=' ';
        for(int i=0; i<str.length(); i++){
            key=str.charAt(i);
            if(map.containsKey(key)==true){
                map.replace(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        key=str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(map.get(str.charAt(i))>map.get(key)){
                key=str.charAt(i);
            }
        }
        return key;
    }
}

