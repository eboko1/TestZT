package fvi.at.zt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reader extends JFrame{
    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    int i,k;
    String a,b;
    MyListener myLis= new MyListener();//силка на обєкт
    //String line1,line2;
    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());//Передаємо значення положення елементів поруч
        b1=new JButton("Очистити ");// кнопка чистить поля ввода для користувача пояснення
        b2 =new JButton("Підрахувати ");
        l1=new JLabel("Введіть перше число ");
        l2=new JLabel("Введіть наступне число ");
        l3=new JLabel("");
        l4=new JLabel("");
        t1=new JTextField(10);// просранство 10 символів
        t2=new JTextField(10);
        // + на екран в такому порядку програма + построчно


        add(t1);
        add(l1);

        add(t2);
        add(l2);
        add(l3);
        add(l4);
        add(b2);
        add(b1);
        b2.addActionListener(myLis);// додати кнопці Listener
        b1.addActionListener(myLis);
    }
public class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {//метод визивається коли щось виконується на ПК
        try {
            if (e.getSource() == b2) { //повертає значення і == кнопці підрахувати
                i = Integer.parseInt(t1.getText());
                k = Integer.parseInt(t2.getText());
                i++;
                k++;
                l3.setText(a);
                l4.setText(b);
                a = "Ваше перше число = " + i;
                b = "Наступне число = " + k;
            }
            if (e.getSource() == b1) {
                t1.setText(null);
                t2.setText(null);
                l3.setText(null);
                l4.setText(null);

            }
        } catch (Exception ex){JOptionPane.showMessageDialog(null,"Введіть в поле число! ");}
    }
}


    //public void Scan(){
       //1// System.out.println("Введіть перше число ");
       //Scanner scn= new Scanner(System.in);
        // i=scn.nextInt();
        //System.out.println("Введіть наступне число ");
        //1//k=scn.nextInt();

       //2// line1= JOptionPane.showInputDialog("Введіть перше число ");
        //line2= JOptionPane.showInputDialog("Введіть наступне число ");
        //i=Integer.parseInt(line1);
        //k=Integer.parseInt(line2);}

       //2//  public void Scan(int a, int b){
       //      JOptionPane.showInputDialog("Тепер ваше перше число = "+a);
       //      JOptionPane.showInputDialog(" ваше наступне число = "+b);}

}
