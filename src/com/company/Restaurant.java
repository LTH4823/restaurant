package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    private Menu[] menus;

    public Restaurant(){
        menus = new Menu[5];
        menus[0] = new Menu("짜장면",6000);
        menus[1] = new Menu("간짜장",7500);
        menus[2] = new Menu("만두",5000);
        menus[3] = new Menu("해물짬뽕",7000);
        menus[4] = new Menu("볶음밥",7500);
    }

    public Menu getMenusByPrice(int money){

        List<Menu> result = new ArrayList<>();
        Menu selectMenu = new Menu("", 0);
        
        for (int i = 0; i < menus.length ; i++) {

            Menu menu = menus[i];
            if(menu.price <= money) {
                result.add(menu);
            }
        }

        for (Menu temp: result) {
            if (selectMenu.price< temp.price){
                selectMenu = temp;
            }
        }

        return selectMenu;
    }

    public Menu[] getAllMenus() {
        return menus;
    }


}
