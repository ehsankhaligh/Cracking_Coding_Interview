import java.util.*;
import java.lang.*;
import java.io.*;
 
class ActivitySelection
{
    //  n   -->  Total number of activities
    //  s[] -->  An array that contains start time of all activities
    //  f[] -->  An array that contains finish time of all activities
    public static void printMaxActivities(int s[], int f[], int n)
    {
    int i, j;
      
    System.out.print("Following activities are selected : (n)");
      
    // The first activity always gets selected
    i = 0;
    System.out.print(s[i]+" ");
      
    // Consider rest of the activities
    for (j = 1; j < n; j++)
    {
         // If this activity has start time greater than or
         // equal to the finish time of previously selected
         // activity, then select it
         //System.out.println("("+s[j] +"?"+ f[i]+")");
         if (s[j] >= f[i])
         {
              System.out.print(s[j]+" ");
              i = j;
          }
     }
    }
      
    public static void main(String[] args)
    {
    int s[] =  {1, 3, 0, 5, 8, 5};
    int f[] =  {2, 4, 6, 7, 9, 9};
    int n = s.length;
        
    printMaxActivities(s, f, n);
    }
     
}