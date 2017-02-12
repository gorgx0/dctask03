package com.marcinkrasowski;

import java.util.Arrays;

/**
 * Created by gorg on 11.02.17.
 */
public abstract class AbstractAttribute {

    abstract public String toString(int level) ;

    @Override
    public String toString() {
        return toString(0);
    }

    protected char[] createPrefix(int level) {
        char[] prefix = new char[level];
        Arrays.fill(prefix,'\t');
        return prefix;
    }
}
