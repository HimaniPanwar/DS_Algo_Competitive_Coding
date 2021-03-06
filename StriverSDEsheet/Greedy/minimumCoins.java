package StriverSDEsheet.Greedy;

public class minimumCoins {
    public int coinChange(int[] coins, int amount) {
        int[] table = new int[amount+1];
        table[0] = 0;
        
        for (int i = 1; i <= amount; i++)
            table[i] = Integer.MAX_VALUE;
        
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    int sub_res = table[i-coins[j]];
                    
                    if(sub_res!=Integer.MAX_VALUE && sub_res+1<table[i])
                        table[i] = sub_res+1;
                }
            }
        }
        
        if(table[amount] == Integer.MAX_VALUE)
            return -1;
        
        return table[amount];
    }
}
