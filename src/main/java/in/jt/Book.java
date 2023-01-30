package in.jt;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="Book")
public class Book {
	private Integer bid;
	private String bname;
	private Double bprice;
}
