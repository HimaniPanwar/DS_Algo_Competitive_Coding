package ArraysAndVectors;

//Program to select activities in cases of conflicting times

import java.util.*;

public class BusyLife {

public static int countActivites(ArrayList<List<Integer>> activities){
    //Complete this method
    
   // Collections.sort(activities, (a,b) -> Integer.valueOf(a.get(1).compareTo(b.get(1))));

    int count = 1,j=0;
    
    for(int i=1;i<activities.size();i++){
        if(activities.get(i).get(0) >= activities.get(j).get(1)){
            count++;
            j = i;
        }
    }
    
    return count;
}

public static void main(String[] args) {
    
    ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();

    list.add(Arrays.asList(7,9));
    list.add(Arrays.asList(0,10));
    list.add(Arrays.asList(4,5));
    list.add(Arrays.asList(8,9));
    list.add(Arrays.asList(4,10));
    list.add(Arrays.asList(5,7));

    int count = countActivites(list);

    System.out.println(count);

}
}
