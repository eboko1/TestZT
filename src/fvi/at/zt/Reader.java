package fvi.at.zt;

import java.util.Scanner;

/**
 * Created by Vika on 28.10.2016.
 */
public class Reader {
    int i;
    int k;
    public void Scan(){
        System.out.println("Введіть перше число ");
       Scanner scn= new Scanner(System.in);
         i=scn.nextInt();
        System.out.println("Введіть наступне число ");
        k=scn.nextInt();
    }

}
