class Solution {
    public String getPermutation(int n, int k) {
       int fact[] = new int[10];
        fact[0] = 1;
        String str = "";
        for(int i = 1; i <=n; i++){
            fact[i] = fact[i-1] * i;
            str += String.valueOf(i);
        }

        String output = "";
        int ind = n - 1;
        int quot = 0;
        k--;
        while(output.length() != n){
            System.out.println("quot "+quot+" output" + output+" str "+str+ " k "+k+ " fact "+fact[ind]);                      

             quot = k / fact[ind];
            k = k % fact[ind];
            output += str.charAt(quot);
            str = str.substring(0, quot) + str.substring(quot + 1);
            ind--;
        }
        
            return output;
        
    }
    
    public void helper_permut(List<Integer> numbers, String per, List<String> output, int n){
        
    }
}