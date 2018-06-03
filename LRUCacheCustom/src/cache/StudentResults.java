package cache;

/*
 * Author : Hemanth Chalumuri 
 * Description : This is a bean class , whose objects will be stored in the cache
 */
public class StudentResults {

	String rank;
	String name;
	Integer marks;
	Integer Percentage;
	
	 public StudentResults() {
	}
	
	public StudentResults(String rank, String name, Integer marks, Integer percentage) {
		super();
		this.rank = rank;
		this.name = name;
		this.marks = marks;
		Percentage = percentage;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Integer getPercentage() {
		return Percentage;
	}
	public void setPercentage(Integer percentage) {
		Percentage = percentage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Percentage == null) ? 0 : Percentage.hashCode());
		result = prime * result + ((marks == null) ? 0 : marks.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentResults other = (StudentResults) obj;
		if (Percentage == null) {
			if (other.Percentage != null)
				return false;
		} else if (!Percentage.equals(other.Percentage))
			return false;
		if (marks == null) {
			if (other.marks != null)
				return false;
		} else if (!marks.equals(other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		return true;
	}
	
}
