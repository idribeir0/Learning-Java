package com.codingjava;

import java.text.NumberFormat;

public class formatting_numbers {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
    }
}


// in this example we are formatting the value using the currency method