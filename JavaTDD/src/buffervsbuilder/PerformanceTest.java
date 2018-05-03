package buffervsbuilder;

import java.util.HashMap;

public class PerformanceTest {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		
		int N = 999999999;
		
		long t;
		
		{
		StringBuffer sb = new StringBuffer();
		t = System.currentTimeMillis();
		for(int i = N; i --> 0;) {
			sb.append("");
		}
		System.out.println(System.currentTimeMillis() - t);
		}
		
		{
		StringBuilder sb = new StringBuilder();
		t = System.currentTimeMillis();
		for(int i = N; i --> 0;) {
			sb.append("");
		}
		System.out.println(System.currentTimeMillis() - t);
		}
	}

}
