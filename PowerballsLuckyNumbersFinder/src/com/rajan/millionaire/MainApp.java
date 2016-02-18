package com.rajan.millionaire;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainApp {
	
	public String key;
	public Integer value;

	public static void main(String[] args) throws IOException {
		String filename = "src/testfiles/numbers.txt";
		
		FileReader fr = new FileReader(filename);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line ;
		Map<String, Integer> generalMap = new HashMap<>();
		Map<String, Integer> powerMap = new HashMap<>();
		String[] arr;
		
		while( (line = br.readLine()) != null){
			if(line.equalsIgnoreCase("end")){
				break;
			}else if(line.trim().equalsIgnoreCase("")){
				continue;
			}
			arr = line.split("\\s+");
			int i=0;
			for(; i< 5; i++){
				if(generalMap.get(arr[i])!=null){
					generalMap.put(arr[i], generalMap.get(arr[i]) + 1);
				}else{
					generalMap.put(arr[i], 1);
				}
			}
			if(powerMap.get(arr[i])!=null){
				powerMap.put(arr[i], powerMap.get(arr[i]) + 1);
			}else{
				powerMap.put(arr[i], 1);
			}
			
		}
		
		Map<Integer, String> sm = returnSortedMap(generalMap);
		for(Integer i: sm.keySet()){
			System.out.println(sm.get(i) + "  =>  " + i);
		}
		
		System.out.println("---------------powerball special---------------");
		sm = returnSortedMap(powerMap);
		for(Integer i: sm.keySet()){
			System.out.println(sm.get(i) + "  =>  " + i);
		}
		
	}

	public static Map<Integer, String> returnSortedMap(Map<String, Integer> map){
		TreeMap m = new TreeMap<Integer, String>();
		
		for(String s: map.keySet()){
			m.put(map.get(s), s);
		}
		
		return m;
	}
}
