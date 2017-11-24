package io.zipcoder;

import java.util.logging.Logger;

public class ItemParseException extends Exception {

    Logger logger = Logger.getLogger("io.zipcoder");


    public ItemParseException(){
        logger.info("Item Parse Exception");
    }

}
