package cache;

/*
 * Author : Hemanth Chalumuri
 * Description: Interface for the available functionality
 */
public interface MyCache {
	public void addCache(StudentResults std);
	public StudentResults readFromCache(String rank);
	public void removeFromCache(String rank);
}
