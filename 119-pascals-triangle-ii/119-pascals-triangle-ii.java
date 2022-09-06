class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> curr = new ArrayList<>();
      curr.add(1);
      double res = 1;
      
      for(int i = 1; i <= rowIndex; i++)
      {
          res *= rowIndex - i + 1;
          res /= i;
          
          curr.add((int)res);
      }
      return curr;
    }
}