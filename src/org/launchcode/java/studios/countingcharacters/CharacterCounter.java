package org.launchcode.java.studios.countingcharacters;

import java.util.ArrayList;
import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args){
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        HashMap<Character, Integer> totalCount = new HashMap<>();

        for(char c: str.toCharArray()){
            if(letters.contains(c)){
                int index = letters.indexOf(c);
                int up = count.get(index);
                up++;
                count.set(index, up);
            } else {
                letters.add(c);
                count.add(1);
            }
        }   for(int i=0; i<letters.size();i++){
            totalCount.put(letters.get(i),count.get(i));
        }
        totalCount.forEach((key, value) -> System.out.println(key+": "+value));
    }
}
