package mainpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student_hashMap_Test {
public static void main(String[] args) {
	// initialize hashMap
	Map<String, Student> hashMap = new HashMap<String, Student>();
	
	// add elements to hashMap
	hashMap.put("001", new Student("A",18,"HN"));
	hashMap.put("002", new Student("B",19,"TN"));
	hashMap.put("004", new Student("C",21,"DN"));
	hashMap.put("003", new Student("E",20,"HD"));
	hashMap.put("005", new Student("D",17,"BN"));
	
	// show hashMap
	show(hashMap);
	
}
public static void show(Map<String, Student> map) {
	Set<String> keySet = map.keySet()
;
	for (String key : keySet) {
		System.out.println(key+ " "+map.get(key));
	}}
}
