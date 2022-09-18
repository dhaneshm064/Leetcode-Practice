/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> output = new ArrayList<>();
        int input[] = new int[n];
        int visited[] = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = i + 1;
        HashMap<String, List<TreeNode>> outputMap = new HashMap<>();
        return helper_generateTrees(1, n, outputMap);
    }
    private List<TreeNode> helper_generateTrees(int startIndex, int lastIndex, HashMap<String, List<TreeNode>> outputMap){
        List<TreeNode> list = new ArrayList<TreeNode>();
        String key = String.valueOf(startIndex) + String.valueOf(lastIndex);
        if(outputMap.get(key) != null)
            return outputMap.get(key);
        if(startIndex > lastIndex)
        {
            list.add(null);
            return list;
        }    
        if(startIndex == lastIndex)
        {
            list.add( new TreeNode(startIndex));
            outputMap.put(key, list);
            return list;
        }
        
        for(int i = startIndex; i <= lastIndex; i++){
            List<TreeNode> leftBranch = helper_generateTrees(startIndex, i - 1, outputMap);
            List<TreeNode> rightBranch = helper_generateTrees(i + 1, lastIndex, outputMap);
            for(TreeNode leftNode: leftBranch)
            {    for(TreeNode rightNode: rightBranch)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    list.add(root);
                //System.out.println("root "+root.val+" left "+root.left.val+" right "+root.right.val);
                }
            }
        }
        outputMap.put(key, list);
        return list;
        
    }
}