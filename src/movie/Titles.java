package movie;



public class Titles implements Comparable<Titles>{
	
	
	private String movieId;
	private String title;
	private String genres;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	
	
	public Titles(String movieId, String title) {
	
		this.movieId = movieId;
		this.title = title;
	} 
	
	public String toString(){
		return movieId + "" + title + "" + genres; 
	}
	@Override
	public int compareTo(Titles o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTitle());
	}


}
