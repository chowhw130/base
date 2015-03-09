package base;

public class User implements Comparable<User> {
	private int id;
	private String name;
	private String email;

	public User(int id, String name, String email){
		this.id=id ;
		this.name=name;
		this.email=email;
//		System.out.println("User [UserId="+id+", UserName="+ name+", UserEmail="+email+"]");
	}
	public int compareTo(User u){
		if (this.id==u.id)
			return 0;
		else if (this.id<u.id)
			return -1;
		return 1;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
 