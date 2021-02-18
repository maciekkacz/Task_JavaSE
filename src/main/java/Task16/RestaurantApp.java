package Task16;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RestaurantApp {

    public static void printMenu() {
        System.out.println( "Welcome in our restaurant" );

        Menu.MENU.forEach( menu -> System.out.println( menu ) );
        System.out.println( "placed orders after a decimal point" );
    }

    public static Order takeOrder() {
        List <Integer> dishesids = getDishesNumbers();
        List <Dish> dishes = Menu.convertIdsToDishes( dishesids );
        return new Order( dishes );
    }

    public static void printSummary(Order order) {
        String summary = order.toString();
        System.out.println( summary );
    }

    private static List <Integer> getDishesNumbers() {
        Scanner scanner = new Scanner( System.in );
        String line = scanner.nextLine();
        String[] split = line.replaceAll( " ", "" ).split( "," );
        return Arrays.stream( split )
                .map( s -> Integer.valueOf( s ) )
                .collect( Collectors.toList() );


    }
}
