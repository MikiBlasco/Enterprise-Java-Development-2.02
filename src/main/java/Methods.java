import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {


    public static List oddArray(int n) {

        List<Integer> odds = new ArrayList<>();

        if (n == 0) {
            return null;
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    odds.add(i);
                }
            }
            return odds;

        }

    }

    static List<String> list2 = Arrays.asList("abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while");

    public static boolean findKeyWords(String phrase){

        List <String> phraseSplit = Arrays.asList(phrase.split(" "));
        for (String w : phraseSplit) {
            if (list2.contains(w)) {
                return true;
            }
        }
        return false;

    }
}
