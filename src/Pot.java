import java.util.Queue;

public class Pot {

    private int M;
    private int count = 0;
    private int buffer[];
    private int front = 0;
    private int rear = 0;
    private boolean empty;



    public Pot(int m) {
        this.M = m;
        this.buffer = new int[M];

        this.empty = true;
    }

    public synchronized void fillPot() throws InterruptedException {

        while(!this.empty) wait();               

        for (int i = 0; i < this.M; i++) {
            buffer[i] = i;
        }
        
        System.out.println("\n==== Cook has filled the pot with "+ this.M +" meals ====");

        this.count = this.M;
        this.empty = false;

        notify();

    }

    public synchronized int getServing() throws InterruptedException {

        while(this.empty) wait();

        int meal = buffer[count-1];
        count--;

        if(this.count == 0) this.empty = true;

        notify();

        return meal;
    }

    public int getM() {
        return M;
    }
}
