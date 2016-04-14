package lab2_1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySeachTest 
{
	//Test - Dlugosc = 1, gdy jest elementem w sekwencji
	@Test
	public void lenOne_foundIndexOne() 
	{
		int[] seq = {1};
		SearchResult sr = BinarySearch.search(1,seq);
		assertThat(sr.isFound(), is(true));
	}
	
	//Test - Dlugosc = 1, gdy element nie jest w sekwencji
	@Test
	public void lenOne_notFoundIndexOne()
	{
		int[] seq = {1};
		SearchResult sr = BinarySearch.search(2, seq);
		assertThat(sr.isFound(),is(false));
	}
	
	//Test - Dlugosc > 1, gdy jest pierwszym elementem w sekwencji
	@Test
	public void lenLongerThanOne_foundIndexOne() 
	{
		int[] seq = {-3,5,6,7};
		SearchResult sr = BinarySearch.search(-3,seq);
		assertThat(sr.isFound(), is(true));
		assertThat(sr.getPosition(),is(1));
	}
	
	//Test - Dlugosc > 1, gdy jest œrodkowym elementem w sekwencji
	@Test
	public void lenLongerThanOne_foundIndexMiddle()
	{
		int[]seq = {-3,4,5,6,7};
		SearchResult sr = BinarySearch.search(5, seq);
		assertThat(sr.isFound(), is(true));
		assertThat(sr.getPosition(), is((seq.length+1)/2));
	}
	
}
