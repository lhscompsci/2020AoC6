package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner inf = new Scanner(new File(("input.dat")));

        int ans = 0;

        ArrayList<Integer> nums = new ArrayList<>();
        Set<String> set = new TreeSet<>();

        while(inf.hasNext()){
            String line = inf.nextLine();
            if(!line.equals("")){
                String[] resps = line.split("");
                set.addAll(Arrays.asList(resps));
            }
            else {
                nums.add(set.size());
                ans+=set.size();
                set=new TreeSet<>();
            }
        }

        
        
        
        System.out.println(ans);
    }
}
