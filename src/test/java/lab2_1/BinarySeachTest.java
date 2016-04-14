package lab2_1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySeachTest 
{

	@Test
	public void seqLength1_shouldFoundIndex() 
	{
		int[] seq = {1};
		SearchResult sr = BinarySearch.search(1,seq);
		assertThat(sr.isFound(), is(true));
	}

}
