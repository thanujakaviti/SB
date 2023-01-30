package in.jt;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XMLToJava {
	public static void main(String[] args) throws IOException, JAXBException {
		
		
		File file =new File("book.xml");
		//System.out.println(file.exists());
		
		JAXBContext context = JAXBContext.newInstance(Book.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(file);
		System.out.println(object);
		
	}
}
