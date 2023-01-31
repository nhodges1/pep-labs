
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        int start = 0;
        int firstletter = 0;
        int end = in.length();
        for(int i = 0; i < end; i++) {
            char c = Character.toLowerCase(in.charAt(i));
            if(c == i) {
                firstletter = i;
                break;
            }
        }
        if(start != firstletter) {
            String startString = in.substring(firstletter, end);
            String endString = in.substring(start, firstletter) + "ay";
            return startString+endString;
        }
        return in;
    }
}
