package cache;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Author : Hemanth Chalumuri 
 * Description : This is LRU Cache Implementation which gives a singleton object
 */
public class CustomCache<K,V> extends LinkedHashMap<K,V> {

	private static CustomCache instance=null;
	private CustomCache(int initialCapacity, float loadFactor, boolean accessOrder) {
		super(initialCapacity, loadFactor, accessOrder);
	}
	
	public static CustomCache getInstance(){
		if(instance==null) {
			synchronized(CustomCache.class) {
				if(instance==null) {
					instance=new CustomCache<>(10, 0.75f, true);
				}
			}
		}
		return instance;
	}
	
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
		 
		 if(this.size()>3)
			 return true;
       return false;
   }

}
