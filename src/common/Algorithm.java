package common;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class Algorithm {

    public String countLetter(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        Set<String> countedWords = new HashSet<>();
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if (!countedWords.contains(str)){
                int index = 0, count = 0;
                while (true) {
                    index = s.indexOf(str, index);
                    if (index != -1) {
                        count++;
                        index += str.length();
                    } else{
                        break;
                    }
                }
                sb.append(str).append("=").append(count).append(", ");
                countedWords.add(str);
            }
        }
        String str = sb.toString().replaceAll(", $", "");
        return str;
    }

    public String countCharacter(String s) {
        s = s.replaceAll("\\s+", "");
        StringBuilder sb = new StringBuilder();
        int count[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[(int) s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++){  
            if (count[i] != 0){
                char c = (char)i;
                sb.append(c).append("=").append(count[i]).append(", ");
            }  
        }
        String str = sb.toString().replaceAll(", $", "");
        return str;
    }
}
