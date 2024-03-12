public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello World";
        int index = 6; 
        char replacementChar = 'X'; 

        String modifiedString = replaceCharAtIndex(originalString, index, replacementChar);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[index] = replacementChar;
        return new String(charArray);
    }
}
