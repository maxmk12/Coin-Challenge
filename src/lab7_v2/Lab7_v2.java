package lab7_v2;

/*
* Author: Max Carr
* Date: 4/13/2018 
* Overview: Runs a greedy algorithm to determine the lowest number of coins needed
* to make a test total. 
*/

public class Lab7_v2{
    public static int[] P(int[] change, int a){
        
//////////////////////////////////////////Checking for array of 0's//////////////////////////////////////////////
        int p = 0;
        for(int k = 0; k < change.length; k++){
            p += change[k];
        }
        if(p == 0){
            throw new IllegalArgumentException("Array of size 0 is not allowed");
        }
///////////////////////////////////////////Checks for change of 0////////////////////////////////////
        if(a == 0){
            int[] array = {0};
            return array;
        }
///////////////////////////////Checks to see what the size of the answer array needs to be////////////
        int v = 0;
        //System.out.println("Here is my total: " + a);
        int t = a;
        while(t!=0){
            for(int g = 0; g < change.length; g++){
                if(change[g] <= t){
                    v++;
                    t = t-change[g];
                    g--;
                }
            }
        }
        int[] ans = new int[v];
        
/////////////////finds the coin size and saves it to the answer file until answer is reached////////////////////
        
        for(int k = 0, j = 0; k < change.length; k++){
            if(a == 0){
                break;
            }
            if(change[k] <= a){
                a = a-change[k];
                ans[j] = change[k];
                j++;
                k--;
            }
            
        }
        for(int op = 0; op < ans.length; op++){
            System.out.println(ans[op]);
        }
        return ans;
    }
}
