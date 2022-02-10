package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.app.core.Category.*;
import com.app.core.Book;
import static java.time.LocalDate.*;

public interface CollectionUtils {
	static List<Book> populateBooks(){
		
		ArrayList<Book> book = new ArrayList<>();
		
		book.add(new Book("ShrimanYogi",CLASSICS, 500.0, parse("2020-10-18"), "RanjitDesai", 20));
		book.add(new Book("Mrutyunjay",CLASSICS, 450.0, parse("2020-10-18"), "ShivajiSawant", 25));
		book.add(new Book("Kosala",CLASSICS, 200.0, parse("2020-10-18"), "BhalchandraNemade", 15));
		book.add(new Book("LordOfTheRings",FICTION, 1000.0, parse("2020-10-18"), "JRRTolkien", 5));
		book.add(new Book("Conjuring",HORROR, 100.0, parse("2020-10-18"), "Random", 19));
		book.add(new Book("Dune",SCIFI, 1100.0, parse("2020-10-18"), "FrankHerbert", 10));
		book.add(new Book("DigitalFortress",SCIFI, 1100.0, parse("2020-10-18"), "DanBrown", 9));
		book.add(new Book("SpiderMan",COMIC, 59.0, parse("2020-10-18"), "StanLee", 17));
		
		
		return book;
	}
	
	static Map<String, Book> populateMapFromList (List<Book> list){
		Map<String, Book> map = new HashMap<>();
		
		for(Book b : list) {
			map.put(b.getTitle(), b);
		}
		
		return map;
		
	}
}
