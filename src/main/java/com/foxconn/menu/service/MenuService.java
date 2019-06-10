package com.foxconn.menu.service;

import com.foxconn.menu.model.Menu;
import com.foxconn.menu.model.TreeNode;

import java.util.List;

public interface MenuService {
    TreeNode<Menu> getMenutree(String root);
}
