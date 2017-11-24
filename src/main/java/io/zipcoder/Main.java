package io.zipcoder;

import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
//If it doesn't work, try static?



        String output = (new Main()).readRawDataToString();
        System.out.println(output);
        // TODO: parse the data in output into items, and display to console.
        ItemParser parser = new ItemParser();
        parser.displayFormattedItems(output);
    }
}
