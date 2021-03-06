package differentOOM;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ConstantPoolOOM {

	/**
	 * -XX:MaxPermSize=10M
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		for(int i=0; i<1000; ++i){
			list.add(UUID.randomUUID().toString().intern());
			System.out.println("分派第"+(i+1)+" 个");
		}
	}

}
