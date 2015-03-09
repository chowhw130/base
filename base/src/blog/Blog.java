package blog;

import java.util.ArrayList;
import java.util.Calendar;

import base.*;


public class Blog {
	private User user;
	private ArrayList<Post> allPosts;
	
	
	public Blog(User user){
		this.user=user;
		allPosts = new ArrayList<Post>();
		 
	}
	public void setUser(User user){
		this.user=user;
	}
	public User getUser(){
		return user;
	}
	public void setPosts(ArrayList<Post> allPosts){
		this.allPosts=allPosts;
	}
	public ArrayList<Post> getPost(){
		return allPosts;
	}
	public void post(Post p){
		// add Post p to the blog
		allPosts.add(p);
		//print a message if succeed
		System.out.println("A New Post:\n"+p);

	}
	public void list(){
		// list all posts in the blog
		System.out.println("Current posts:");
		for(int i =0; i<allPosts.size(); i++){
			int a=i+1;
			System.out.println("Post["+a+"]:"+allPosts.get(i));
			
		}
	}
	
	public void search(int month, String someone){
	//search posts created in month, mentioned someone
	Calendar cal= Calendar.getInstance();
		for (Post p:allPosts){
			cal.setTime(p.getDate());
			int postMonth= cal.get(Calendar.MONTH)+1;
			
			if (postMonth==month && p.getContent().contains(someone))
				System.out.println(p);
			
		}
		
	}
	public void delete(int index){
		//check if index exists
		//if exists then delete
		//else fault message
		if((index<0)||(index>=allPosts.size()))
				System.out.println("Illegal deletion");
			else
				allPosts.remove(index);
				
	
	}
	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPosts=" + allPosts + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
	
}

