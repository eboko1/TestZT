package fvi.at.zt;

import javax.swing.*;

public class Dick {
    public static void main(String[] args) {
        Reader myreader = new Reader("GUI");
        myreader.setVisible(true);// зробити вікно видиме
        myreader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// то як закривається вікно
        myreader.setSize(300,200);// задає розмір вікна
        myreader.setResizable(false); // неможемо змiнювати розміри вікна
        myreader.setLocationRelativeTo(null); // розміщення по ценру
        /*myreader.Scan();
        myreader.i=count(myreader.i);
        myreader.k=count(myreader.k);
        //1//System.out.println("Тепер ваше перше число = " +myreader.i);
        //1//System.out.println("Тепер ваше насупне число = " +myreader.k);
        myreader.Scan(myreader.i, myreader.k);
    }

    private static int count(int x){
         x=x+1;
        return x;

    }*/
    }
}
