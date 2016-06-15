package edu.iis.mto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.*;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

	@Autowired
	BinarySearch binarySearch;

	@Before
	public void before(){
	}
	
	
	//Dlugosc sekwencji 1; element jest w sekwencji
	@SuppressWarnings("static-access")
	@Test
	public void Test1(){
		int[] params1 = {1};
		BinarySearch search = new BinarySearch();
		boolean isValid = true;
		int position = 1;
		
		SearchResult result = search.search(1, params1);
		//assertEquals(1, result.getPosition());
	
		assertThat(result.getPosition(), is(position));
		assertThat(result.isFound(), is(isValid));
	}

	//Dlugosc sekwencji 1; elementu nie ma w sekwencji
	@SuppressWarnings("static-access")
	@Test
	public void Test2(){
		int[] params2 = {1};
		BinarySearch search = new BinarySearch();
		boolean isValid = false;
		int position = -1;
		
		SearchResult result = search.search(2, params2);
		//assertEquals(-1, result.getPosition());
		
		assertThat(result.getPosition(), is(position));
		assertThat(result.isFound(), is(isValid));
	}

	//Dlugosc sekwencji >1; element jest pierwszy
	@SuppressWarnings("static-access")
	@Test
	public void Test3(){
		int[] params3 = {1,2,3};
		BinarySearch search = new BinarySearch();
		boolean isValid = true;
		int position = 1;
		
		SearchResult result = search.search(1, params3);
		//assertEquals(1, result.getPosition());
		
		assertThat(result.isFound(), is(isValid));
		assertThat(result.getPosition(), is(position));
	}

	//Dlugosc sekwencji >1; element jest ostatni
	@SuppressWarnings("static-access")
	@Test
	public void Test4(){
		int[] params4 = {1,2,3};
		BinarySearch search = new BinarySearch();
		boolean isValid = true;
		int position = 3;
		
		SearchResult result = search.search(3, params4);
		//assertEquals(3, result.getPosition());
		
		assertThat(result.isFound(), is(isValid));
		assertThat(result.getPosition(), is(position));
	}

	//Dlugosc sekwencji >1; element jest srodkowy
	@SuppressWarnings("static-access")
	@Test
	public void Test5(){
		int[] params5 = {1,2,3};
		BinarySearch search = new BinarySearch();
		boolean isValid = true;
		int position = 2;
		
		
		SearchResult result = search.search(2, params5);
		//assertEquals(2, result.getPosition());

		assertThat(result.isFound(), is(isValid));
		assertThat(result.getPosition(), is(position));
	}

	//Dlugosc sekwencji >1; elementu nie ma w sekwencji
	@SuppressWarnings("static-access")
	@Test
	public void Test6(){
		int[] params6 = {1,2,3};
		BinarySearch search = new BinarySearch();
		boolean isValid = false;
		int position = -1;
		
		SearchResult result = search.search(4, params6);
		//assertEquals(-1, result.getPosition());
		
		assertThat(result.isFound(), is(isValid));
		assertThat(result.getPosition(), is(position));

	}
	
	//Dlugosc sekwencji >1; elementu nie ma w pomieszanej sekwencji
		@SuppressWarnings("static-access")
		@Test
		public void Test7(){
			int[] params7 = {5,1,4,6,2};
			BinarySearch search = new BinarySearch();
			boolean isValid = false;
			int position = -1;
			
			SearchResult result = search.search(3, params7);
			//assertEquals(-1, result.getPosition());
			
			assertThat(result.isFound(), is(isValid));
			assertThat(result.getPosition(), is(position));

		}

}
