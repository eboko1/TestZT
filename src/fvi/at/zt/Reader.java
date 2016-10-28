package fvi.at.zt;

import javax.swing.JOptionPane;
public class Reader {
    int i,k;
    String line1,line2;

    public void Scan(){
       // System.out.println("Введіть перше число ");
       //Scanner scn= new Scanner(System.in);
        // i=scn.nextInt();
        //System.out.println("Введіть наступне число ");
        //k=scn.nextInt();
        line1= JOptionPane.showInputDialog("Введіть перше число ");
        line2= JOptionPane.showInputDialog("Введіть наступне число ");
        i=Integer.parseInt(line1);
        k=Integer.parseInt(line2);
    }
    public void Scan(int a, int b){
        JOptionPane.showInputDialog("Тепер ваше перше число = "+a);
        JOptionPane.showInputDialog(" ваше наступне число = "+b);

    }

}
