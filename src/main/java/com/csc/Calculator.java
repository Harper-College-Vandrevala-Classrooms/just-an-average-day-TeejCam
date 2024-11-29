package com.csc;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Calculator {

  public int maximumUsingForLoop(int[] nums) {
    int max = nums[0];
    for(int i = 1; i < nums.length; i++) {
      if(nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int minimumUsingForLoop(int[] nums) {
    int min = nums[0];
    for(int i = 1; i < nums.length; i++) {
      if(nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }

  public int sumUsingForLoop(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public int averageUsingForLoop(int[] nums) {
    int average = 0;
    for(int i = 0; i < nums.length; i++) {
      average += nums[i];
    }
    return average / nums.length;
  }

  public int maximumUsingStream(int[] nums) {
    IntStream intstream = IntStream.of(nums);
    int largest = intstream.max().orElse(0);
    return largest;
  }

  public int minimumUsingStream(int[] nums) {
    //IntStream intstream = IntStream.of(nums);
    int smallest = IntStream.of(nums).min().orElse(0);
    return smallest;
  }

  public int sumUsingStream(int[] nums) {
    int total = IntStream.of(nums).sum();
    return total;
  }

  public int averageUsingStream(int[] nums) {
    return (int) IntStream.of(nums)
                          .average()
                          .orElse(0.0);
  }

  public static void main(String[] args) {

    int[] nums = {23, 24, 53, 67, 88, 90};

    System.out.println("This class can house your driver program and / or your functions.");
  }
}
