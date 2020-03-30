import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int pixels = 0;
        double light = 0;
        double red, blue, green, maximum, minimum;
        String str;
        String values[];
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            pixels++;
            str = input.next();
            values = str.split(",");
            red = Integer.parseInt(values[0]);
            blue = Integer.parseInt(values[1]);
            green = Integer.parseInt(values[2]);
            if ((red + blue + green) > 300) {
                light++;
            }
        }
        light = light/pixels;
        if (light > 0.25) {
            System.out.println("day");
        }
        else {
            System.out.println("night");
        }
    }
}
