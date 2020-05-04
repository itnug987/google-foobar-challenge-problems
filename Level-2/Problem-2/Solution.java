public class Solution {
    public static int solution(String s) {
        //Your code here
        
        char arr[] = s.toCharArray();
        
        int greater_than = 0;
        int count =0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '-'){
                continue;
            }
            else if(arr[i] == '>'){
                greater_than++;
            }
            
            else if(arr[i]== '<'){
                count = count+ greater_than*2;
            }
        }
        
        return count;
    }
    
    public static void main(String args[]){
        System.out.println(solution(">----<"));
    }
}