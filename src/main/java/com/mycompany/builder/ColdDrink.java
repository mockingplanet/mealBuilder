/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author alu10711158
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Can();
    }

    @Override
    public abstract float price();
}
