/*1ST QUESTION
Consider that there is a cricket player named Smith who hits certain number of 4s and 6s in a cricket match. Find out total numbers of scores he makes with his 
4s & 6s only.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a<0)||(b<0))
        {
        System.out.println("0");
        }
        else
        {
            System.out.println((a*4)+(b*6));
        }
    }
}
