package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

@SuppressWarnings({ "serial", "hiding" })
public class GetFreq<String,Values> extends Hashtable<String, Integer>{
	
	public void freqs(ArrayList<java.lang.String> a,ArrayList<java.lang.String> a2,ArrayList<java.lang.String> a3,MyHashSet<String> hash)
	{
		Integer count;
		for(String token:hash)
		{
			count=(Collections.frequency(a, token)+Collections.frequency(a2, token)+Collections.frequency(a3, token));
			this.put(token, count);
		}	//I'm putting keys and values to hashtable
	}
	public void showValues()
	{
		int greatest=0;
		String best=(String) "";
		for(String token: this.keySet())
		{
			System.out.println(token+":\t"+this.get(token));// printing every key and it's value to the screen
			if(this.get(token)>greatest)
			{
				greatest=this.get(token);
				best=token;
			}//remembering the greatest freq so far and it's key
		}
		System.out.println("En sık kullanılan sözcük \""+best+"\"");
		System.out.println("En sık kullanılan sözcüğün frekansı: "+greatest);
		
	}
	

	
}
