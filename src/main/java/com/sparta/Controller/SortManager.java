package com.sparta.Controller;

import com.sparta.Model.Sorter.Sorters.BinaryTree.BinaryTree;
import com.sparta.Model.Sorter.Sorters.BubbleSort;
import com.sparta.Model.Sorter.Sorters.MergeSort;
import com.sparta.Model.Sorter.Sorter;

public class SortManager {
    public Sorter getSorter(String userChoiceOfSorting){
        if(userChoiceOfSorting == null){
            return null;
        }
        if(userChoiceOfSorting.equals("1")){
            return new BubbleSort();

        } else if(userChoiceOfSorting.equals("2")){
            return new MergeSort();

        } else if(userChoiceOfSorting.equals("3")){
            return new BinaryTree();
        }

        return null;
    }
}
