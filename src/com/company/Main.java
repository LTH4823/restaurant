package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);
        RestaurantUI ui = new RestaurantUI(restaurant, scanner);

        ui.init();



    }
}
