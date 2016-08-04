package testautow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AutowireDemoConfig.class);
		Book book = (Book) context.getBean("book");
		System.out.println(book.getAuthor().getAuthorName());
	}

}
