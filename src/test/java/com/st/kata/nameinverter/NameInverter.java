package com.st.kata.nameinverter;

public class NameInverter {

    public String invert(String name) {
        if (StringHelper.isEmptyOrSpaces(name)) {
            return "";
        }
        String[] splitName = name.split(" ");
        return StringHelper.createInvertedString(splitName);
    }
}

class StringHelper {

    public static String createInvertedString(String[] splitName) {
        return String.format("%s, %s", splitName[1], splitName[0]);
    }

    public static boolean isEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }

}
