package fvi.at.zt;

public class Dick {
    public static  void main (String [] args){
        Reader myreader=new Reader();
        myreader.Scan();
        myreader.i=count(myreader.i);
        myreader.k=count(myreader.k);
        //System.out.println("Тепер ваше перше число = " +myreader.i);
        //System.out.println("Тепер ваше насупне число = " +myreader.k);
        myreader.Scan(myreader.i, myreader.k);
    }

    private static int count(int x){
         x=x+1;
        return x;

    }
}
