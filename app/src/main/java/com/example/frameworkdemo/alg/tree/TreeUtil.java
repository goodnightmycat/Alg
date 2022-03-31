package com.example.frameworkdemo.alg.tree;

import com.example.frameworkdemo.alg.tree.TreeNode;

import java.util.List;

public class TreeUtil {

    /**
     * 左叶子节点总和
     */
    public static int countLeftLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        //左边
        if (root.left != null) {
            if (isLeaf(root.left)) {
                result += root.left.value;
            } else {
                result += countLeftLeaf(root.left);
            }
        }
        //右边
        if (root.right != null) {
            if (isLeaf(root.right)) {
                return result;
            } else {
                result += countLeftLeaf(root.right);
            }
        }
        return result;
    }

    public static boolean isLeaf(TreeNode root) {
        return (root.left == null && root.right == null);
    }


    /**
     * 叶子节点总和
     */
    public static int countLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (root.left == null && root.right == null) {
            result += root.value;
        } else {
            result += countLeaf(root.left);
            result += countLeaf(root.right);
        }
        return result;
    }


    /**
     * 最大深度
     */
    public static int findMaxLength(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = 1 + findMaxLength(root.left);
        int rightCount = 1 + findMaxLength(root.right);
        return Math.max(leftCount, rightCount);
    }

    /**
     * 中序遍历
     */
    public static void logTreeInOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        logTreeInOrder(root.left, result);
        result.add(root.value);//3行代码，这行放哪里，就是x序遍历
        logTreeInOrder(root.right, result);
    }


    /**
     * 两棵树是否相同
     */
    public static boolean isTwoTreeSame(TreeNode tree1, TreeNode tree2) {

        //都为Null
        if (tree1 == null && tree2 == null) {
            return true;
        } else if (tree1 == null || tree2 == null) {
            //有一个为null
            return false;
        } else if (tree1.value != tree2.value) {
            //值不相等
            return false;
        } else {
            //值相等，继续寻找左右子树
            return isTwoTreeSame(tree1.left, tree2.left) && isTwoTreeSame(tree1.right, tree2.right);
        }
    }


    /**
     * 二叉树轴对称
     */
    public static boolean symmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return p.value == q.value && symmetric(p.left, q.right) && symmetric(p.right, q.left);
    }


}
