package StriverSDEsheet.Greedy;

import java.util.*;

class ItemComparator implements Comparator<Item>{
        
    public int compare(Item a , Item b){
        double r1 = (double)(a.value)/(double)(a.weight);
        double r2 = (double)(b.value)/(double)(b.weight);
        
        if(r1>r2)
            return -1;
        else if(r1<r2)
            return 1;
        else 
            return 0;
    }
}

public class fractionalKnapsack {
    double fractionalKnapsackF(int W, Item arr[], int n) 
    {
        
        Arrays.sort(arr,new ItemComparator());
        
        int currentW=0;
        double finalVal=0.0;
        
        for(int i=0;i<n;i++){
    
            if(currentW+arr[i].weight <= W){
                currentW += arr[i].weight;
                finalVal += arr[i].value;
            }else{
                int remainW = W - currentW;
                finalVal += ((double)arr[i].value/(double)arr[i].weight)*(double)remainW;
                break;
            }
        }
        
        return finalVal;
        
    }
}
