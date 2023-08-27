package ninjaslayground;
import java.util.HashMap; 
import java.util.Map;

public class countFrequecyInRange {   
     public static int[] countFrequency(int n, int x, int []nums){  
               // Write your code here.     
        Map<Integer,Integer>mp=new HashMap<>();   
        for(int i=0;i<n;i++)     {      
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);   
        }            
        int y[]=new int[n];      
        for(int i=0;i<n;i++){        
           y[i]=mp.getOrDefault(i+1,0);
                       
             }        
          return y ; 
      }
                
 }
