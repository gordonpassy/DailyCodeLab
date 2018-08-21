/**
 * @author gordonopassy
 */
public class DuplicateEncoder {
    /**
     *
     * @param args
     */
    public static void main(String[]args){
        String word="Prespecialized";
        System.out.println(encode(word));
    }

    /**
     * The goal of this exercise is to convert a string to a new string
     * where each character in the new string is
     * '(' if that character appears only once in the original string, or ')' if that character appears
     * more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
     * @param word {@link String}
     * @return String
     *
     */
    static String encode(String word){
        char[]wordCharacters=word.toLowerCase().toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (char character: wordCharacters) {
            int characterCount=0;
            for(char chr:wordCharacters){
                if(chr==character)
                    characterCount+=1;
            }
            stringBuilder.append(characterCount>1?')':'(');
        }
        return stringBuilder.toString();
    }
}
