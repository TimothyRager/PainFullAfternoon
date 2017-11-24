package io.zipcoder;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CounterHandler extends Handler{

    private ArrayList<LogRecord> records = new ArrayList<LogRecord>();

    public int exceptionCount(){
        int ipeCounter=0;

        for (LogRecord r : records){
            if ("Item Parse Exception".equalsIgnoreCase(r.getMessage())){
                ipeCounter++;
            }
        }
        return ipeCounter;
    }

    @Override
    public void publish(LogRecord record) {
        records.add(record);
    }
    @Override
    public void close() throws SecurityException {

    }
    @Override
    public void flush() {

    }
}
