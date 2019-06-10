package com.foxconn.menu.model;

import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T>  {
    T data;
    TreeNode<T> parent;
    List<TreeNode<T>> childrens;
    public TreeNode(T data){
        this.data = data;
        this.childrens = null;
    }

    private void createChild(){
        this.childrens = new ArrayList<TreeNode<T>>();
    }

    public TreeNode<T> addChild(T child){
        if(this.childrens == null){
            this.createChild();
        }
        TreeNode<T> childnode = new TreeNode<T>(child);
        childnode.parent = this;
        this.childrens.add(childnode);
        return childnode;
    }
    public TreeNode<T> addChild(TreeNode<T> childnode){
        if(this.childrens == null){
            this.createChild();
        }
        childnode.parent = this;
        this.childrens.add(childnode);
        return childnode;
    }

    public TreeNode<T> addJsonChild(TreeNode<T> childnode){
        if(this.childrens == null){
            this.createChild();
        }
        childnode.parent = null;//this; 為了將樹生成json,取消parent
        this.childrens.add(childnode);
        return childnode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public List<TreeNode<T>> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<TreeNode<T>> childrens) {
        this.childrens = childrens;
    }
}
