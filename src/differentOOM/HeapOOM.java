package differentOOM;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	static int MB = 1024*1024;
	
	/**
	 * -Xmx16M
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		
		for(int i=0; i<1000; ++i){
			ByteBuffer bb = java.nio.ByteBuffer.allocate(MB);
			list.add(bb);
			System.out.println("分派第"+(i+1)+" MB");
		}

	}
}
