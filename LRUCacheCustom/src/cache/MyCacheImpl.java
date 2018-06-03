package cache;

public class MyCacheImpl implements MyCache {
	
	CustomCache<String,StudentResults> cache=null;

	@Override
	public void addCache(StudentResults std) {
		if(cache==null)
			cache=CustomCache.getInstance();
		cache.put(std.getRank(), std);
		System.out.println("Rank "+std.getRank()+" Added into cache");
		
	}

	@Override
	public cache.StudentResults readFromCache(String rank) {
		
		return cache.get(rank);
	}

	@Override
	public void removeFromCache(String rank) {
		cache.remove(rank);
	}

	 
	
}
