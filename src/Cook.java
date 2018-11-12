import java.util.Random;

public class Cook extends Thread {

    private Pot diningPot;
    private Random rand;

    public Cook(Pot pot) {
        diningPot = pot;
        this.rand = new Random();
    }

    public void run() {

        while (true){

            try{

                diningPot.fillPot();
                System.out.println("\n==== Cook has filled the pot with "+ this.diningPot.getM() +" meals ====");

                int tempo = rand.nextInt(2000);
                Thread.sleep(tempo);

            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}