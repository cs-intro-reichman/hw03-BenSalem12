/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
		int ascii;
        char ch;
        for (int i = 0; i< s.length(); i ++){
			ch = s.charAt(i);
            ascii = ch;
            if(ascii>=65 && ascii<=90) {
                ascii = ascii + 32; 
                ch = (char)ascii;
                s = s.substring(0, i) + ch + s.substring(i + 1);			
			}
		}
        return s;
    }
}