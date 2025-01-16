class Solution {
    public String removeOuterParentheses(String s) {
        
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count>0){  // besacue we comapare before increment 
                    ans.append(ch);
                }
                count++;// Increment balance for '('     
            }
            if(ch==')'){
                count--;// Decrement balance for ')'  we will compare after decrement 
                if(count>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}