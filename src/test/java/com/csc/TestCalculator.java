package com.csc;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }


  @Test 
  void testMaxUsingForLoop() {
    int[] nums = {3, 4, 1, 6};
    assertEquals(6, calculator.maximumUsingForLoop(nums));
  }

  @Test 
  void testMinUsungForLoop() {
    int[] nums = {23, 77, 89, 90, 26};
    assertEquals(23, calculator.minimumUsingForLoop(nums));
  }

  @Test 
  void testSumUsingForLoop() {
    int[] nums = {23, 77, 89, 90, 26};
    assertEquals(305, calculator.sumUsingForLoop(nums));
  }

  @Test 
  void testAverageUsingForLoop() {
    int[] nums = {1, 2, 3};
    assertEquals(2, calculator.averageUsingForLoop(nums));
  }

  @Test 
  void testMaxUsingStream() {
    int[] nums = {3, 4, 1, 6};
    assertEquals(6, calculator.maximumUsingStream(nums));
  }

  @Test 
  void testMinUsingStream() {
    int[] nums = {3, 7, 2, 8, 9};
    assertEquals(2, calculator.minimumUsingStream(nums));
  }

  @Test 
  void testSumUsingStream() {
    int[] nums = {23, 77, 89, 90, 26};
    assertEquals(305, calculator.sumUsingStream(nums));
  }

  @Test 
  void testAverageUsingStreams() {
    int[] nums = {1, 2, 3};
    assertEquals(2, calculator.averageUsingStream(nums));
  }

}
