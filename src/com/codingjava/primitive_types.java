package com.codingjava;

public class primitive_types {

    public static void main(String[] args) {
        byte age = 30;
        int viewsCount = 123456789;
        long viewsAccountLong = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
    }
}

// in java, we can use underscore (_) to separate numbers

//large numbers java still recognize as integer so we need to put the L in the final of the number like "3_123_456_789L" and we change the type for long or if is a float we can put the "F"

//Primitive Type	Size	Range/Values
//byte	1 byte	-128 to 127
//short	2 bytes	-32,768 to 32,767
//int	4 bytes	-2^31 to 2^31 - 1
//long	8 bytes	-2^63 to 2^63 - 1
//float	4 bytes	±3.40282347E+38F (6-7 decimal digits)
//double	8 bytes	±1.79769313486231570E+308 (15 decimal digits)
//char	2 bytes	0 to 65,535 (Unicode characters)
//boolean	1 bit	true or false