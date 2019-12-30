package NewsPaper;

import java.util.ArrayList;

public class BookClub implements Publisher ,Subscriber{
	    private String name;
	    private ArrayList<Book> books = new ArrayList<>();
	    public ArrayList<Subscriber> subscribers = new ArrayList<>();
	@Override
	public void update(Readable r) {
		// TODO Auto-generated method stub
		
	}

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
	 public void addBook(Book b){
	        books.add(b);

	    }
	    public void removeBook(Book b){
	        books.remove(b);
	    }
	    
	    public boolean checkIfBoek(Readable r) {
	    	
	    	for(int i = 0; i< books.size();i++) {
	    		if(r.equals(i)) {
	    		return true;
	    	} else {
			return false;
	    	}
	    }
   return false;
}

		@Override
		public String toString() {
			return "BookClub ( name = "  +  name  +  ", books="  +  books + "\n" +", subscribers="  
		+  subscribers  +  ")";
		}
	    
}