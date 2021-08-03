package Reader;

import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface LamdaSample {
	public void display(Map<Integer, List<String>> dataMap);
}