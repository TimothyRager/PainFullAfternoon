package io.zipcoder;

import java.util.ArrayList;

public class ProjectDisplayItem {

    private String name="";
    private Integer totalCount=0;
    private ArrayList<Double> pricesEncountered=new ArrayList<Double>();
    private ArrayList<Integer> timesEncountered=new ArrayList<Integer>();

    public ProjectDisplayItem(String passedName, Double passedPrice){
        name=passedName;
        totalCount++;
        pricesEncountered.add(passedPrice);
        timesEncountered.add(1);
    }
    public boolean isSameItem(String passedName){
        return (name.compareTo(passedName)==0);
    }
    public void incrementCounters(Double passedPrice){

        totalCount++;
        if (pricesEncountered.contains(passedPrice)){
            int index = pricesEncountered.indexOf(passedPrice);
            timesEncountered.set(index, (timesEncountered.get(index)+1) );
        } else{
            pricesEncountered.add(passedPrice);
            timesEncountered.add(1);
        }
    }

    @Override
    public String toString(){
        StringBuilder returnMe = new StringBuilder();

        returnMe.append("name:");
        for (int i=0; i<8-name.length(); i++)
            returnMe.append(" ");
        returnMe.append(name);
        returnMe.append(" \t \t ");
        returnMe.append("seen: ");
        returnMe.append(totalCount);
        returnMe.append(" times\n");
        returnMe.append("============= \t \t =============\n");

        for (int i=0; i<pricesEncountered.size(); i++) {
            returnMe.append("price:");
            returnMe.append("   ");
            returnMe.append(pricesEncountered.get(i));
            returnMe.append(" \t \t ");
            returnMe.append("seen: ");
            returnMe.append(timesEncountered.get(i));
            returnMe.append(" times\n");
            returnMe.append("------------- \t \t -------------\n");
        }
        returnMe.append("\n");
        return (returnMe.toString());
    }

}
