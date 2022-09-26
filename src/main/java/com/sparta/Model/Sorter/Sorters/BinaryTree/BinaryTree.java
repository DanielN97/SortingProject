package com.sparta.Model.Sorter.Sorters.BinaryTree;

import com.sparta.Model.Sorter.Sorter;

import java.util.ArrayList;

public class BinaryTree implements Sorter {
    private Node root;
    private ArrayList<Integer> orderedArray = new ArrayList();

    public BinaryTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void treeInsert(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            insert(arr[i]);
        }
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            orderedArray.add(root.key);
            inOrderRec(root.right);
        }
    }

    public static int[] convertArrayListToArray(ArrayList<Integer> integers)
    {
        int[] result = new int[integers.size()];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = integers.get(i).intValue();
        }
        return result;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        treeInsert(arrayToSort);
        inOrderRec(root);
        return convertArrayListToArray(orderedArray);
    }
}
