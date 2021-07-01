package com.sajusman.lms.Utilities;

import java.nio.charset.Charset;
import java.util.Random;

public class RandomUtil {
    public static String getString(int size){
        byte[] array = new byte[size]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
