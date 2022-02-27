package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    private Menu[] menus;

    public Restaurant(){
        menus = new Menu[3];
        menus[0] = new Menu("A",1000);
        menus[1] = new Menu("A",2000);
        menus[2] = new Menu("A",3000);
    }

    public List<Menu> getMenusByPrice(int money){

        List<Menu> result = new ArrayList<>();
        Menu selectMenu = new Menu("", 0);
        
        for (int i = 0; i < menus.length ; i++) {

            Menu menu = menus[i];
            if(menu.price <= money) {
                result.add(menu);
            }
        }

        for (:
             ) {
            
        }
        
        
        
        return result;
    }

    public Menu[] getAllMenus() {


        return menus;
    }


}
