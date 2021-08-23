package activities;

public class Activity5 extends MyBook{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBook book = new MyBook();
		String title = "Activity5";

		book.setTitle(title);

		book.getTitle();
		System.out.println("Title = "+book.getTitle());
	}

}
