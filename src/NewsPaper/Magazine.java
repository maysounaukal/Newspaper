package NewsPaper;

public class Magazine implements Readable{
	private String title;
    private String text;
    private int articles;
    private int edition;
    
    public Magazine(String title, String text, int articles, int edition) {
    	this.title = title;
    	this.text = text;
    	this.articles = articles;
    	this.edition = edition;
    }

	@Override
	public void read() {
		System.out.println("the magazine is being read");
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + articles;
		result = prime * result + edition;
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
		Magazine other = (Magazine) obj;
		if (articles != other.articles)
			return false;
		if (edition != other.edition)
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

	@Override
	public String toString() {
		return "\n" +"Magazine ( title="  +  title +  ", text="  + text +  ", articles="  + articles  + ", edition="
	  +  edition + ")";
	}
	
	

}
