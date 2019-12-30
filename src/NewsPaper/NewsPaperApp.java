package NewsPaper;

import java.time.LocalDate;

public class NewsPaperApp {

	public static void main(String[] args) {
	Book book1 = new Book("vrouw","eigenschappen",14);
	NewsPaper krant = new NewsPaper(12,"match","voetbal",20,LocalDate.of(1992, 11, 1));
	Magazine magazine = new Magazine("Gezondheid","sport",12,4);
	Person person1 = new Person("Maysoun");
	Person person2 = new Person("Maha");
	//Book,NewsPaper,Magazine zijn subklassen van interface Reable
	person1.update(book1);
	person1.update(krant);
	person1.update(magazine);
	
	
	
	BookClub bc = new BookClub();
	bc.subscribe(person2);
	bc.addBook(book1);
	
	MagazinePublisher mp = new MagazinePublisher();
	mp.subscribe(person1);
	
	System.out.println(person1);
	System.out.println(bc);
	System.out.println();
	

	}


}
