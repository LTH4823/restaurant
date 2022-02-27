package com.company;
import java.util.Scanner;

public class RestaurantUI {

    private Restaurant restaurant;
    private Scanner scanner;

    public RestaurantUI(Restaurant restaurant, Scanner scanner) {
        this.restaurant = restaurant;
        this.scanner = scanner;
    }

    public void init() {
        System.out.println("1. 가격 입력, 2.전체 메뉴");

        int oper = Integer.parseInt(scanner.nextLine());

        switch (oper){
            case 1:
                inputPrice();
                break;
            case 2:
                showMenus();
                break;
        }
    }

    private void inputPrice() {
        System.out.println("얼마?");
        int money = Integer.parseInt(scanner.nextLine());
        restaurant.getMenusByPrice(money).forEach(menu -> System.out.println(menu));

    }

    private  void showMenus(){
        System.out.println("현재 메뉴는 아래와 같이 준비되어 있습니다.");
        for (Menu menu : restaurant.getAllMenus()) {
            System.out.println(menu.name+"\t"+menu.price+"원");
        }
    }
}
