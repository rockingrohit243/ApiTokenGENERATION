package com.springtest.in.springtestfile;

import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//@SpringBootTest
class SpringtestfileApplicationTests {
	private Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}
	@Test
	void testSum()
	{
		int expectedResult=17;

		//actual
		int actualResult=c.doSum(12,3,2);

		//ASSERTJ:it is a java library that provide  a rich set of assertions and truly helpful error message ,improve test code redability

		//forr testing
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	@Test
	void testProduct()
	{
	int actualRes=c.doProduct(5,6);
	int expectedRes=30;
	assertThat(actualRes).isEqualTo(expectedRes);
	}
	@Test
	void testCompareNums()
	{
		boolean actualResult=c.compareTwoNums(4,4);
		//boolean expectedResult=true;
		//assertThat(actualResult).isEqualTo(expectedResult);
		assertThat(actualResult).isTrue();

	}
//	@AfterEach
//	public void down()
//	{
//		System.out.println("after each");
//	}
//	@BeforeEach
//	public void up()
//	{
//		System.out.println("before each");
//	}

}
