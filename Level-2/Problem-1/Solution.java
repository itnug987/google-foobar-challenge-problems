public class Solution {
    public static int[] solution(int[] l, int t) {
        // Your code here
        int result[] = new int[2];
        
        result[0] = -1;
        result[1] = -1;
        
        outer: for(int i=0;i<l.length-1;i++){
            if(l[i] == t){
                result[0]= i;
                result[1] = i;
                break;
            }
            
            int sum = l[i];
            
            for(int j=i+1;j<l.length;j++){
                sum= sum+l[j];
                if(sum == t){
                    result[0] = i;
                    result[1] = j;
                    
                    break outer;
                }
            }
        }
        
        return result;
        
    }
    
    public static void main(String args[]){
        int l[] = {4, 3, 5, 7, 8};
        
        int t = 12;
        
        int arr[] = solution(l,t);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}