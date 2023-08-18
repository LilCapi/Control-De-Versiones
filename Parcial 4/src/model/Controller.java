package model;

import java.util.ArrayList;

public class Controller {

	private ArrayList<Book> bookList;

	public Controller() {
		bookList = new ArrayList<Book>();
		testCases();

	}

	public void testCases() {

		bookList.add(new Book("AF3", "Las mil y una noches", 125));
		bookList.add(new Book("E42", "El viejo y el mar", 223));

	}

	// Pending
	public boolean registerBook(String id, String name, int pages) {

		Book newbook = new Book(id, name, pages);

		return bookList.add(newbook);

	}

	// Pending
	public void sortListDescending() {

		int respuesta = 0;
		int counter = 0;

		while (counter < 25) {

			for (int i = 0; i < bookList.size()-1; i++) {

				Book book1 = bookList.get(i);
				Book book2 = bookList.get(i+1);
				
				respuesta = book1.compareTo(book2);
	
				if (respuesta == -1) {
	
					bookList.set(i+1, book1);
	
					bookList.set(i, book2);
					
				}
	
				if (respuesta >-1) {
	
					counter++;
					
				}	
			}
			
		}

	}

	// Pending
	public Book[][] fillMatrix() {

		sortListDescending();

			Book[][] matrix = new Book[5][5];

		boolean flag = false;
		
		for (int i = 0; i < bookList.size(); i++) {	

			for (int j = 0; j < matrix.length && !flag; j++) {

				for (int k = 0; k < matrix[0].length && !flag; k++) {

					if (matrix[j][k] == null) {

						matrix[j][k] = bookList.get(i);

						flag = true;

					}

				}
				
			}
			flag = false;
		}

		return matrix;

	}

	public int subtraction(){
		return 1-2;
	}

	public String showMatrix() {

		Book[][] matrix = fillMatrix();

		String print = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == null) {

					print += "_______" + " ";
				} else {

					int page = matrix[i][j].getPages();
					String pages = page+"";
					while (pages.length() <3) {
						pages = "0"+pages;
						
					}
					print += matrix[i][j].getId() + "-"+ pages +" ";
				}

			}
			print += "\n";
		}

		return print;
	}

}
