package test;

import java.io.*;
import java.util.Date;
import base.*;
import blog.*;

public class TestBlog {

	/*
	public String getInput(){
		String line = "";
		System.out.print("Enter the prompt:");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
	return line;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBlog testBlog = new TestBlog();
		User user = new User(1, "boy", "abc@abcmail.hk");
		Blog myblog = new Blog(user);
		String prompt = null;
		
		while(!(prompt = testBlog.getInput()).equals("exit")){
			// String prompt has already stores the input, now deal with it
			
			if(prompt.startsWith("list")){
				myblog.list();
			}
			else if(prompt.startsWith("post ")){
				//TODO get content from prompt
				String content = prompt.substring(5);
				Date date = new Date();
				Post post = new Post(date, content);
				myblog.post(post);
			}
			else  if(prompt.startsWith("delete ")){
				//Detete the post at the index parameter
				//TODO get index from prompt
				int index= Integer.parseInt(prompt.substring(7));
				myblog.delete(index-1);
			}
		}

	}
	*/
}
	
	
	
	