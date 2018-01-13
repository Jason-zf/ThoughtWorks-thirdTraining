import java.util.Vector;

public class Mommifier {

    public static void main()
    {
        mommy("abb");
    }
    public static String mommy(String inputStr) {
        String res = "";
        boolean isPrevCharacterVowel = false;
        int n = 0;
        float length = inputStr.length();
        for (int i = 0; i < length; ++i) {
            String subStr = inputStr.substring(i, i + 1);
            if (isVowel(subStr.toLowerCase())) {
                ++n;
                if (isPrevCharacterVowel==false)
                    res += "mommy";
                else
                    res += subStr;
                isPrevCharacterVowel = true;
                continue;
            }
            isPrevCharacterVowel = false;
            res+=subStr;
        }
        if (n > length * 0.3)
            return res;
        return inputStr;
    }

    public static boolean isVowel(String str) {
        if (str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u"))
            return true;
        return false;
    }


}
