package ArraysAndHashing.encodeAndDecodeString;

public class EncodeAndDecodeString {
    public static String encode (List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str); // 4#Iint
        }
        return sb.toString();
    }
    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {

            int delimeter = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimeter));
            String decoderStr = str.substring(delimeter + 1, delimeter + 1 + length);
            res.add(decoderStr);
            i = delimeter + 1 + length;
        }
        return res;
    }
}
