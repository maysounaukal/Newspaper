package NewsPaper;

public interface Publisher {
	 void subscribe(Subscriber s);
	 void unsubscribe(Subscriber s);
	 void publish(Readable r);
}
