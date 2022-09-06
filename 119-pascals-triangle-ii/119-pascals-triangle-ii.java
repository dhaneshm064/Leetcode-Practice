class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> curr = new ArrayList<>();
        curr.add(1);

      if(rowIndex == 0)
        return curr;
    
      int calcPtr = 0;
      if(rowIndex%2 == 0)
          calcPtr = rowIndex/2;
      else
          calcPtr = (rowIndex + 1)/2;
      double res = 1;
      int highPtr = rowIndex;
      for(int i = 1; i <= rowIndex; i++)
      {
          res *= highPtr - i + 1;
          res /= i;
          
          curr.add((int)res);
      }
      return curr;
    }
}