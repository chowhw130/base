package base;

import java.util.Date;

public class FriendsPost extends Post {

	public FriendsPost(Date date, String content) {
		super(date, content);
		// TODO Auto-generated constructor stub
		
	}
	public FriendsPost(Date date, String content, User user){
		
		super(date, content);
		this.friend=user;
		
	} 
	private User friend;
}
