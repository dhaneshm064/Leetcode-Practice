class Solution {
     public List<String> wordBreak(String s, List<String> wordDict) {
       Set<String> wordSet = new HashSet<>();
        for(String word: wordDict)
            wordSet.add(word);
        List<String> sentences = new ArrayList<>();
        wordBreakHelper(0, 0, wordSet, s, "", sentences);
         return sentences;
    }
    
    private void wordBreakHelper(int startIndex, int endIndex, Set<String> wordSet, String input, String sentence, List<String> sentences){
        
        if(startIndex == input.length())
        {
            sentences.add(sentence.trim());
        }
        
        
        while(endIndex < input.length()){
            String word = input.substring(startIndex, endIndex + 1);
            if(wordSet.contains(word))
            {
                wordBreakHelper(endIndex + 1, endIndex + 1, wordSet, input, sentence + word + " ", sentences);
            }
            endIndex++;
        }
    }
}