package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static utils.CollectionUtils.*;
import com.app.core.Book;

public interface IOUtils {
	
	static void storeBooksDetails(Map<String, Book> map,String fileName) throws IOException {
		// java app --> dos --> bos --> fos --> file
		// above method will require more thats we do serialization in below using objectOutputStream;
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			// serialization= conv of the state of the obj + meta  data info
			out.writeObject(map);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	static Map<String, Book> restoreBookDetails(String fileName) throws IOException,ClassNotFoundException {
		// validate
		// create file instance
		
		File file = new File(fileName);
		if(file.exists() && file.isFile() && file.canRead()) {
			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
			{
				return (Map<String, Book>)in.readObject();
			}
		}
		else {
			return populateMapFromList(populateBooks());
		}
		
	}
	
}
