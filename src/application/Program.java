package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Post> lista = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		for(int i = 1; i<=2; i++) {
			
			System.out.print("Data (DD/MM/YYYY HH:MM:SS): ");
			Date moment = sdf.parse(sc.nextLine());
			
			System.out.print("Titulo: ");
			String title = sc.nextLine();
			
			System.out.print("Conteudo: ");
			String content = sc.nextLine();
			
			System.out.print("Numero de Likes: ");
			int likes = sc.nextInt();
			
			Post p = new Post(moment, title, content, likes);
			sc.nextLine();
			
			for(int j = 1; j<=2; j++) {
				System.out.print("Comentario "+i+"_"+j+": ");
				String text = sc.nextLine();
				p.addComment(new Comment(text));
			}
			
			lista.add(p);
		}
		sc.close();
		
		for(Post p : lista) {
			System.out.println(p);
		}
	}
}
