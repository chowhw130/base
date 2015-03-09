/* lab2 - object
 * creating objects to make a mini blog.
 * consist of date, content (posts), users.
 * 
 */
package base;
import java.util.Date;

public class Post implements Comparable<Post>{
	private Date date; 
	private String content;
	
	public Post(Date date, String content){
		this.date = date;
		this.content = content;
	}
	
	public Date getDate(){
		return date;
	}
	public void setDate(Date date){
		this.date= date;
	}
	
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content= content;
	}
	
	public String toString(){
		return this.date+"\n"+this.content;
	}
	public boolean equals(Object o){
		boolean ans = true;
		if (this==o) return ans;
		if (o==null) return false;
		if (this.getClass()!=o.getClass()) return false;
		Post post = (Post) o;
		if (this.date != post.date) ans= false;
		if (this.content != post.content) ans= false;
		return ans;
	}

	public int hashCode(){
		
		int a= date.hashCode();
		int b = content.hashCode();		
		return a*17+b*3;
	}
	
	public boolean contains(String keyword){
		
		return this.content.contains(keyword);

	}
	public int compareTo(Post p){
		return this.date.compareTo(p.date);
	}
	
	
}



