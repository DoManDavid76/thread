import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue {

	Queue<Integer> queue;
	Random direction;
	
	public CarQueue() {
		
		queue = new ArrayDeque<Integer>();
		direction = new Random();
		
		queue.add(direction.nextInt(4));
		queue.add(direction.nextInt(4));
		queue.add(direction.nextInt(4));
		queue.add(direction.nextInt(4));
		queue.add(direction.nextInt(4));

	}
	
	public Integer deleteQueue() {
		return queue.remove();
	}
	
	public void addToQueue() {
		class QRunnable implements Runnable{
			
			public void run() {
				try {
					while(true) {
						queue.add(direction.nextInt(4));
						Thread.sleep(20);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		Runnable r = new QRunnable();
		Thread t = new Thread(r);
		t.start();
		
	}
	
	
}
