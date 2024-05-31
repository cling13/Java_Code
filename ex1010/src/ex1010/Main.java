package ex1010;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st= new StringTokenizer(bf.readLine());
		int k=Integer.parseInt(st.nextToken());
		
		for(int j=0; j<k; j++)
		{
			st=new StringTokenizer(bf.readLine());
		int m=Integer.parseInt(st.nextToken());
		int n= Integer.parseInt(st.nextToken());
		int t=n-m;
		
		long x=1, y=1;
		
		if(t>m)
		{
			int tmp=t;
			t=m;
			m=tmp;
		}
		
		for(int i=1; i<=t; i++)
		{
			x*=i;
		}
		for(int i=m+1; i<=n; i++)
		{
			y*=i;
		}
	
		long res=y/x;
		
		
		bw.write(res+"\n");
		
		}
		bw.close();
	}
}
