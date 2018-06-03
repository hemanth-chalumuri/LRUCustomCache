package cache;

import java.util.Iterator;

public class TestingCache {

	
	public static void main(String[] args) {
		StudentResults s1 = new StudentResults("1","student1",100,100);
		StudentResults s2 = new StudentResults("2","student2",200,200);
		StudentResults s3 = new StudentResults("3","student3",300,300);
		StudentResults s4 = new StudentResults("4","student4",400,400);
		MyCacheImpl my = new MyCacheImpl();
		my.addCache(s1);
		my.addCache(s2);
		my.addCache(s3);
		my.addCache(s4);
		
		System.out.println("Initially cache is : "+my.cache);
		
		StudentResults o1=my.readFromCache("3");
		System.out.println("Cache -> "+my.cache);
	}

}
