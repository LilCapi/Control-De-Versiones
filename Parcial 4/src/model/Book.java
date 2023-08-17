package model;

public class Book implements Comparable<Book>{

	private String id;
	private String name;
	private int pages;

	public Book(String id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public int compareTo(Book o) {
		if (this.getPages() > o.getPages()) {

			return 1;

		} else if (this.getPages() < o.getPages()) {

			return -1;
		}

		return 0;
	}



}
