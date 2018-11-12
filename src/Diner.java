import java.util.Random;

public class Diner {

    public static void main (String args[]){

        Pot p = new Pot(4);

        Savage s1 = new Savage(p);
        Savage s2 = new Savage(p);
        Savage s3 = new Savage(p);
        Savage s4 = new Savage(p);
        Cook c = new Cook(p);

        c.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();


    }

}

