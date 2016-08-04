package testautow;

import org.springframework.stereotype.Component;

@Component
public class Author {

	private String authorName;
	
	public Author() {
		this.authorName = "youssef harkati";
		System.out.println("constructor : i am called");
		
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
