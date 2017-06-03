import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        String str="abccccdd";
        int count=checkPalindrome(str);
        System.out.println("Max Length :"+ count);
        
    }
    
    public static int checkPalindrome(String str){
        int length=str.length();
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if(isPalindrom(str.substring(i,j+1))){
                    System.out.println(str.substring(i,j+1));
                    if(!map.containsKey(str.substring(i,j+1)))
                        map.put(str.substring(i,j+1),str.substring(i,j+1).length());
                }
                    
            }
        }
        
        int max=0;
        
        for(Map.Entry<String,Integer> pair:map.entrySet()){
            if(max<pair.getValue())
                max=pair.getValue();
            System.out.println(max);
                
        }
        return max;
    }
    
    public static boolean isPalindrom(String str){
        int sublength=str.length();
        if(sublength==1)
            return false;
        else{
            for(int i=0;i<=sublength/2;i++){
                if(str.charAt(i)!=str.charAt(sublength-1-i))
                    return false;
            
            }
            return true;
        }
    }
}
    
    
    
    
    
