public class Solution {
    public static String solution(String x) {
        // Your code here
        char arr[] = x.toCharArray();
        
        char reverse[] = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                 int r_index = arr[i]-'a';
                 arr[i] = reverse[r_index];
            }
        }
        
        String s = String.valueOf(arr);
        
        return s;
    }
    
    
    public static void main(String args[]){
        System.out.println(solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
        
    }
}