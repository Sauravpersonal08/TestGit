package com.crm.qa.base;

import java.io.File;
import java.io.IOException;

public class BatchExecutionJava {

	public static void main(String[] args) throws Exception {
		
		
		ProcessBuilder p = new ProcessBuilder("cmd" , "/c" ,"Test_batch");
		File dir = new File("C:\\Users\\ssp34\\Desktop\\automation");
		p.directory(dir);
		Process execute = p.start();

	}

}
