package ds.recursivemergesort;

import java.util.Comparator;

public class ByCityName implements Comparator<IPAddress> {

	@Override
	public int compare(IPAddress o1, IPAddress o2) {
		// TODO Auto-generated method stub
		return o1.getCityName().compareTo(o2.getCityName());
	}

}
