package edu.iis.mto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
		SearchResult result = search.search(1, params1);
		assertEquals(1, result.getPosition());
	}

	//Dlugosc sekwencji 1; elementu nie ma w sekwencji
	@SuppressWarnings("static-access")
	@Test
	public void Test2(){
		int[] params2 = {1};
		BinarySearch search = new BinarySearch();
		SearchResult result = search.search(2, params2);
		assertEquals(-1, result.getPosition());
	}

	//Dlugosc sekwencji >1; element jest pierwszy
	@SuppressWarnings("static-access")
	@Test
	public void Test3(){
		int[] params3 = {1,2,3};
		BinarySearch search = new BinarySearch();
		SearchResult result = search.search(1, params3);
		assertEquals(1, result.getPosition());
	}

	//Dlugosc sekwencji >1; element jest ostatni
	@SuppressWarnings("static-access")
	@Test
	public void Test4(){
		int[] params4 = {1,2,3};
		BinarySearch search = new BinarySearch();
		SearchResult result = search.search(3, params4);
		assertEquals(3, result.getPosition());
	}

	//Dlugosc sekwencji >1; element jest srodkowy
	@SuppressWarnings("static-access")
	@Test
	public void Test5(){
		int[] params5 = {1,2,3};
		BinarySearch search = new BinarySearch();
		SearchResult result = search.search(2, params5);
		assertEquals(2, result.getPosition());
	}

	//Dlugosc sekwencji >1; elementu nie ma w sekwencji
	@SuppressWarnings("static-access")
	@Test
	public void Test6(){
		int[] params6 = {1,2,3};
		BinarySearch search = new BinarySearch();
		SearchResult result = search.search(4, params6);
		assertEquals(-1, result.getPosition());
	}

}
