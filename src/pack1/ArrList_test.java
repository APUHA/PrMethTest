package pack1;

import java.util.*;

public class ArrList_test {

	public void run(){
		ArrayList<String> sList = new ArrayList<String>();
		while(true){
			String line = readLine("?");
			if (line.equals("")) break;
			sList.add(line);
		}
	}
	
}
