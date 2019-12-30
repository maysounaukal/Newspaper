package NewsPaper;

import java.util.ArrayList;

public class newsPaperPublisher implements Publisher{
	  private String name;
	    private ArrayList<Subscriber> subscribers = new ArrayList<>();
	@Override
	public void subscribe(Subscriber s) {
		
		subscribers.add(s);
	}

	@Override
	public void unsubscribe(Subscriber s) {
		subscribers.remove(s);
	}

	@Override
	public void publish(Readable r) {
		// TODO Auto-generated method stub
		
	}

}
