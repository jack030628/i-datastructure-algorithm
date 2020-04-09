package com.us.improve.leetcode.binarytree;

/**
 * @ClassName Height
 * @Desciption 求二叉树的高度
 * @Author loren
 * @Date 2020/4/8 4:17 PM
 * @Version 1.0
 **/
public class Height {

    public static int solve(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = solve(node.getLeft());
        int rightHeight = solve(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1, new Node(2, null, null), null);
        System.out.println(solve(root));
    }

}
