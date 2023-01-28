package com.company;

public class Tree {
    private com.company.TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new com.company.TreeNode(value);
        } else{
            root.insert(value);
        }
    }
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
    public com.company.TreeNode get(int value) {
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }
}