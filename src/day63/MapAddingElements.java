package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {

        //Creating HashMap object
        Map<String,Integer > nameAgePair = new HashMap<>();

        //adding elements
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Ruhksona",16);
        nameAgePair.put("Zehra",7);



        System.out.println("nameAgePair = " + nameAgePair);


        //getting the size of a map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        //how do we get a value according to the key
        System.out.println("Zehra's age = " + nameAgePair.get("Zehra"));

        //how do i check a key already exist or not
        System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Ruhksona"));

        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));

        //how do i only add new items if it does not already exist

        nameAgePair.putIfAbsent("Zehra",10);
        System.out.println("nameAgePair = " + nameAgePair);

        //Updating the element in the Map using replace
        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
        //why don't we just use put? what is the downside ?
        //If i don't have that key , it will just add new one and that's not what we want , we only want to update

        //updating the value only if the old value equals to specific value
        //update Zehra's age to 9 if it was 17
        nameAgePair.replace("Zehra",7,10);
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));



        //removing Entry by the key
        nameAgePair.remove("Fatih");
        // try not to use get method to check you have the entry or not
        //because if you don't have the key you will get null
        //but you will also get null if the value was actually null --{fatih=Null}
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));














    }

}
