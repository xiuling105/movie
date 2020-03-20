package movie;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class Main {
	
	public static final int movieId_COL	= 0;
	public static final int title_COL=1;
	public static final int genres_COL=2;

    public static Titles createTitleRow(String[] row) {
    	Titles t = new Titles((row[movieId_COL]), null);;
    	t.setTitle(row[title_COL]);		
       	t.setGenres(row[genres_COL]);
    	return t;
    	
    }
    
    public static Data createDataFile(String fileName) throws IOException{
        String fileName1 = "C:\\Users\\xiuli\\Desktop\\Eclipse_workspace\\movie\\src\\movie-data\\movies.csv";
    	CSVReader reader = new CSVReader(new FileReader(fileName1));
    	String[] nextLine;
    	reader.readNext();
       	while ((nextLine = reader.readNext()) != null) {
    		if (nextLine != null) {
                //Verifying the read data here
    			Titles titles = createTitleRow(nextLine);
    			System.out.println(titles);
    			
    			
            }
    		
//    		Data movies= new Data();
//    		movies.add(titles);
        		
        		
                
//             }reader.close();
    		
    	
//		return movies;
    	}
    	  	
  

	public static void main(String[] args) throws IOException {
		
		
//		Data movies = createDataFile("movies.csv");
	    System.out.println(movies);
		movies.sortByTitle();
		System.out.println(movies);
		Titles t = movies.findByName("Toy Story");
	    System.out.println("Found"+ t);	
		
	}

}
