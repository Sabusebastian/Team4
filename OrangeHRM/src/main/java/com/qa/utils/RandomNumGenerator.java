package com.qa.utils;

import java.util.Random;

public class RandomNumGenerator {
	
	public static void randomNum() {
		
		Random random = new Random();
        int RandomNum = random.nextInt(10000);
        System.out.println(RandomNum);
	}
}
