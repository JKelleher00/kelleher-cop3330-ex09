package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem9{
    public static void main(String args[]){
        final int gal = 350;
        Scanner a = new Scanner(System.in);
        System.out.print("What is the length of the room? ");
        int l = a.nextInt();
        System.out.print("What is the width of the room? ");
        int w = a.nextInt();
        int area = l*w;
        int gall;
        if(area%gal != 0)
            gall = area/gal +1;//yeah, im lazy, but it works doesn't it?
        else gall = area/gal;
        System.out.println("You will need "+gall+" gallons of paint to cover "+area+" square feet");
    }
}
