package java_practise;

import java.util.HashSet;

import org.testng.annotations.Test;

public class number_of_occures {
@Test
public void number()
{
	int a[]= {1,2,2,3,4,5,6,6};
	
	HashSet<Integer> hs = new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) 
	{
		hs.add(a[i]);
	}
	System.out.println(hs);
	for (Integer no : hs) 
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(no.equals(a[i]));
			{
			  count++;
			  
			}
		}
		System.out.println(no+" ="+ count);
	}
}	
@Test
public void testing()
{
	HashSet<Integer> hs = new HashSet<Integer>();
	
	int a1[]= {11,12,13,14,15,16,17,17};
	int length=a1.length;
	int count=0;
	
	for(int i=0;i<length;i++)
	{
		hs.add(a1[i]);
		for(int n:hs)
		
				System.out.println(n);
		}	
}}

