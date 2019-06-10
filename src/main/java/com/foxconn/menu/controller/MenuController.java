package com.foxconn.menu.controller;

import com.foxconn.menu.model.Menu;
import com.foxconn.menu.model.TreeNode;
import com.foxconn.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/{menuno}")
    public TreeNode<Menu> index(@PathVariable String menuno){
        return menuService.getMenutree(menuno);
    }
}
