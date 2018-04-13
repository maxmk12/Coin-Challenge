package lab7_v2;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/*
* Author: Max Carr
* Date: 4/13/2018 
* Overview: Tests the Lab7_v2.java file with 5 tests, if the array is all 0's
* if the array is empty, if the array is american coins and a total value of 50,
* if the array is american coins and has a total value of 73, and if the array 
* are not american and the total value is 46.
*/

public class Lab7_v2Test {
    @Test(expected = IllegalArgumentException.class)
    public void test1(){
        int array[] = {0,0,0,0};
        int total = 0;
        int expected[] = {0};
        Lab7_v2.P(array, total);
    }   
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        int array[] = {};
        int total = 0;
        int expected[] = {0};
        Lab7_v2.P(array, total);
    }
    @Test
    public void test3(){
        int array[] = {25,10,5,1};
        int total = 50;
        int expected[] = {25,25};
        Lab7_v2.P(array, total);
        Assert.assertArrayEquals(expected, Lab7_v2.P(array, total));
    }
    @Test
    public void test4(){
        int array[] = {25,10,5,1};
        int total = 73;
        int expected[] = {25,25,10,10,1,1,1};
        Assert.assertArrayEquals(expected, Lab7_v2.P(array, total));
    }
    @Test
    public void test5(){
        int array[] = {20,15,5,1};
        int total = 46;
        int expected[] = {20,20,5,1};
        Assert.assertArrayEquals(expected, Lab7_v2.P(array, total));
    }
}
