package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner inf = new Scanner(new File(("input.dat")));

        int ans = 0;

        ArrayList<Integer> nums = new ArrayList<>();
        Map<String,Integer> map = new TreeMap<>();
        int groupCounter = 0;

        while(inf.hasNextLine()){
            String line = inf.nextLine();
            System.out.println(line);
            if(!line.equals("")){
                groupCounter++;
                String[] resps = line.split("");
                for(String s:resps){
                        if(map.containsKey(s))
                            map.put(s,map.get(s)+1);
                        else
                            map.put(s,1);
                }

            }
            else {
                int sum = 0;
                for(String k: map.keySet()){
                    System.out.println("how many of "+k+": "+map.get(k));
                if(map.get(k) == groupCounter) {
                        sum+=1;
                    }
                }
                        nums.add(sum);
                        ans += sum;
System.out.println("gc: "+groupCounter +"\nsum: "+sum);
                map=new TreeMap<>();
                groupCounter = 0;
            }
        }

        
        
        
        System.out.println("the answer is "+ans);
    }
}
