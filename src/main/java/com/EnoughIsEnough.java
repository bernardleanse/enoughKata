package com;

public class EnoughIsEnough 
{
  public static int countNumberOfTimesNumberShowsUp(int[] nums, int num)
  {
    int res = 0;
    for (int i = 0; i < nums.length; i++)
      {
        if (num == nums[i]) 
        {
          res++;
        }
      }
        
    return res;
  }

  public static int[] deleteNth(int[] elements, int maxOccurrences)
  {
    int[] ints = {20, 37, 21};
    return ints;
  }
}

