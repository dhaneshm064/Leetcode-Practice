class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> output = new ArrayList<>();
        List<String> row = new ArrayList<>();
        helperPartition(s, 0, row, output);
        return output;
    }
    
    private void helperPartition(String s, int partIndex, List<String> row, List<List<String>> output){
        if(partIndex ==  s.length())
        {   
            List<String> copy = new ArrayList<>(row); 
            output.add(copy);
             return;               
        }else if(partIndex >= s.length()){
            return;
        }
        for(int index = partIndex; index < s.length(); index++){
           if(checkPalindrome(s.substring(partIndex, index + 1)))
            {
                row.add(s.substring(partIndex, index + 1));
                helperPartition(s, index + 1, row, output);
                row.remove(row.size() - 1);
            }
        }
        return;
    }
    
    private Boolean checkPalindrome(String str){
        if(str.length() == 1)
            return true;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
}