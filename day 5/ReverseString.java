package week3.day1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="TestLeaf";
char[] CharArray=str.toCharArray();
for (int i =CharArray.length-1 ; i>=0; i--) {
	System.out.println("reversed string:"+CharArray[i]);
	
}
}
}
