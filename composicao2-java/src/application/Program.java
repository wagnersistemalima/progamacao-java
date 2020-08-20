package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment comentario1 = new Comment("Have a nice trip");
		Comment comentario2 = new Comment("Wow that's awesome!");
		
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		post1.addComment(comentario1);
		post1.addComment(comentario2);
		
		
		Comment comentario3 = new Comment("Good night");
		Comment comentario4 = new Comment("May the Force be with you");
		
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		post2.addComment(comentario3);
		post2.addComment(comentario4);
		
		
		System.out.println(post1);
		System.out.println(post2);

	}

}
