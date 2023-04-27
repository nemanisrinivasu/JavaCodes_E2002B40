/*WAP to accpet one array of stings and integers.and count the number of stings and integers present in the array. Example Input: First line Accept size of array second line accept all elements like Array = {"Raj", "77", "101", "99", "Jio"}*/
import java.io.*;
import java.util.*;

public class Solution 
{
    static boolean isNumber(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'>=0&&s.charAt(i)-'9'<=0){}
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            if(isNumber(s[i]))
                count++;
        }
        System.out.println(count);
        System.out.println(n-count);
    }
}
