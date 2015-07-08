package differentOOM;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class DirectMemoryOOM {

	static int ONE_MB = 1024*1024;
	
	/**
	 * -XX:MaxDirectMemorySize=5M
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		List<ByteBuffer> list = new ArrayList<ByteBuffer>();
		
		for(int i=0; i<ONE_MB;++i){
			ByteBuffer buffer = ByteBuffer.allocateDirect(ONE_MB*128);		
			list.add(buffer);
			System.out.println("分派第"+(i+1)+" 个128MB");
		}
					
	}

}
