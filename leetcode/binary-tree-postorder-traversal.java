class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        if(root.left!=null) list.addAll(postorderTraversal(root.left));
        if(root.right!=null) list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
