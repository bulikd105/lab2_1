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
	public void lenOne_notFound()
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
	
	//Test - Dlugosc > 1, gdy jest ostatnim elementem w sekwencji
	@Test
	public void lenLongerThanOne_foundIndexLast()
	{
		int[] seq = {-3,5,6,7};
		SearchResult sr = BinarySearch.search(7, seq);
		assertThat(sr.isFound(), is(true));
		assertThat(sr.getPosition(), is((seq.length)));
	}
	
	//Test - Dlugosc > 1, gdy elementu nie ma w sekwencji
	@Test
	public void lenLongerThanOne_notFound()
	{
		int[] seq = {-3,4,5,6,7};
		SearchResult sr = BinarySearch.search(10, seq);
		assertThat(sr.isFound(), is(false));
	}
}
