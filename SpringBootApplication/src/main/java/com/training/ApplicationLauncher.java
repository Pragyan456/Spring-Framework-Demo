package com.training;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationLauncher {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationLauncher.class, args);		
	}
	
	/*In order to register other classes of this application (controller,service,repository etc.) by the spring framework ,those classes have to be 
	 * in the same  package of this main class or they have to be placed
	 * in subpackages of main class
	 */

}
