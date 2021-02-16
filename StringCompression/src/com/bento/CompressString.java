package com.bento;

public class CompressString {
    public static void main(String[] args) {
        System.out.println(String.format("%s -> %s", "abcaaabbb", compressString("abcaaabbb")));
        System.out.println(String.format("%s -> %s", "abcd", compressString("abcd")));
        System.out.println(String.format("%s -> %s", "aaabaaaaccaaaaba", compressString("aaabaaaaccaaaaba")));
    }

    private static String compressString(String string) {
        if (string == null)
            return null;

        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(i - 1)) {
                stringBuilder.append(string.charAt(i - 1));
                if (count > 1)
                    stringBuilder.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        stringBuilder.append(string.charAt(string.length() - 1));
        if (count > 1)
            stringBuilder.append(count);

        return stringBuilder.toString();
    }
}
