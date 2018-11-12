import java.util.Random;

public class Savage extends Thread {

    private Pot diningPot;
    private Random rand;

    public Savage(Pot pot) {
        diningPot = pot;
        this.rand = new Random();
    }

    public void run() {

        while (true){

            try{

                int meal = diningPot.getServing();

                System.out.println("\n==== Savage is eating meal number: "+ (meal+1));

                int tempo = rand.nextInt(800);
                Thread.sleep(tempo);

            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}