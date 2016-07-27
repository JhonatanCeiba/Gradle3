package org.gradle;

import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
public class BookTest {
		public Sencilla sencilla;
		
	@Before 
	public void instanciacion()
	{
		sencilla = new Sencilla("Hola", "Jhonatan");
	}
	
	@Before
	public void instanciacionMockito()
	{
		// mock creation
		List<String> mockedList = mock(List.class);
		
		// using mock object - it does not throw any "unexpected interaction" exception
		mockedList.add("one");
		mockedList.clear();
		
		// selective, explicit, highly readable verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}
	
	@Test
	public void testMockito()
	{
		// you can mock concrete classes, not only interfaces
		LinkedList mockedList = mock(LinkedList.class);

		// stubbing appears before the actual execution
		when(mockedList.get(0)).thenReturn("first");

		// the following prints "first"
		System.out.println(mockedList.get(0));

		// the following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));
	}
	
	@Test
	public void Sencila()
	{
		String nombre = sencilla.getNombre();
		assertEquals("Jhonatan", nombre);
	}
	
	 @Test
	 public void Testeo()
	 {
		 assertTrue(true);
	 }
	 
	 @Test
	 public void Testeo2()
	 {
		 assertTrue(true);
	 }
	 
	 @Test
	 public void Testeo3()
	 {
		 assertTrue(true);
	 }
	 
	 @Test
	 public void Testeo4()
	 {
		 String saludo = "Hola";
		 assert("Hola".equals(saludo));
	 }
	 
	  //private static BookDAL mockedBookDAL;
	  private static Book book1;
	  private static Book book2;

	 /* @BeforeClass
	  public static void setUp(){
	    //Create mock object of BookDAL
	    mockedBookDAL = mock(BookDAL.class);

	    //Create few instances of Book class.
	    book1 = new Book("8131721019","Compilers Principles",
	            Arrays.asList("D. Jeffrey Ulman","Ravi Sethi", "Alfred V. Aho", "Monica S. Lam"),
	            "Pearson Education Singapore Pte Ltd", 2008,1009,"BOOK_IMAGE");

	    book2 = new Book("9788183331630","Let Us C 13th Edition",
	            Arrays.asList("Yashavant Kanetkar"),"BPB PUBLICATIONS", 2012,675,"BOOK_IMAGE");

	    //Stubbing the methods of mocked BookDAL with mocked data. 
	    when(mockedBookDAL.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
	    when(mockedBookDAL.getBook("8131721019")).thenReturn(book1);
	    when(mockedBookDAL.addBook(book1)).thenReturn(book1.getIsbn());
	    when(mockedBookDAL.updateBook(book1)).thenReturn(book1.getIsbn());
	  }*/

	  public void testGetAllBooks() throws Exception {}

	  public void testGetBook() throws Exception {}

	  public void testAddBook() throws Exception {}

	  public void testUpdateBook() throws Exception {}
	}