package telecode;

import java.util.HashMap;

import com.sun.xml.internal.ws.util.StringUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hola");
		System.out.println("hola2");
		System.out.println("hola3");
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(0, "abc");
		map.put(1, "def");
		map.put(2, "ghi");
		
		String s  = "f";
		 
		 for (Integer key : map.keySet()) {
		        System.out.println("Key = " + key);
		        if (map.get(key).contains(s)){
		        	
		        }
		    }
		
		
		
		 
		
			
			
		}
		 

	}

