package NewsPaper;

public class Book implements Readable{
	 private String title;
	 private String text;
	  private int chapters;
	  
	  
	  
	  

	public Book(String title, String text, int chapters) {
		this.title = title;
		this.text = text;
		this.chapters = chapters;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chapters;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (chapters != other.chapters)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	 /* @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Book book = (Book) o;
	        return chapters == book.chapters &&
	                Objects.equals(title, book.title) &&
	                Objects.equals(text, book.text);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(title, text, chapters);
	    }*/



	@Override
	public void read() {
		System.out.println("the book is being read | het boek wordt gelezen");
		
	}





	@Override
	public String toString() {
		return "Book ( title = "  +  title +  ", text="  +  text +  ", chapters="  +  chapters +  ")";
	}
 
}
