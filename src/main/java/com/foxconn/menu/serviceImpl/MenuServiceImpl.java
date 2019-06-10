package com.foxconn.menu.serviceImpl;

import com.foxconn.menu.mapper.MenuMapper;
import com.foxconn.menu.mapper.MenuSubMapper;
import com.foxconn.menu.model.Menu;
import com.foxconn.menu.model.TreeNode;
import com.foxconn.menu.service.MenuService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    //@Autowired
    @Resource
    private MenuMapper menuMapper;
    @Resource
    //@Autowired
    private MenuSubMapper menuSubMapper;

    @Override
    public TreeNode<Menu> getMenutree(String root) {
        List<Menu> rootlist =  menuSubMapper.fincByMenuNo(root);
        Menu rootdata = rootlist.get(0);
        TreeNode<Menu> rootnode = new TreeNode<>(rootdata);
        return getMenutree(rootnode);
    }

    private TreeNode<Menu> getMenutree(TreeNode<Menu> root){

        List<Menu> childMenus = menuMapper.findByUpMenuNo(root.getData().getM_NO());
        if(childMenus.size() > 0){
            for(int i=0;i < childMenus.size();i++) {
                TreeNode<Menu> childnode = new TreeNode<>(childMenus.get(i));
                root.addJsonChild(childnode);
                getMenutree(childnode);
            }
        }
        return root;
    }
}
