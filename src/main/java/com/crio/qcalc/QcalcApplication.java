package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {
    
	public static void main(String[] args) {
		// StandardCalculator calc = new StandardCalculator();
		// calc.add(1, 1);
		// System.out.println(calc.getResult());
		// calc.add(Double.MAX_VALUE, 1.0);
		// calc.printResult();
		// calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
		

		LogicCalculator calc = new LogicCalculator();

		calc.AND(8, 6);
		
		calc.printResult();
		

		
		
		
//calc.printResult();
		//System.out.println("Hello world!");
        
		//SpringApplication.run(QcalcApplication.class, args);
	}

}
