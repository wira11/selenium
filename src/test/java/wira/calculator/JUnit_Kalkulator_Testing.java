package wira.calculator;

import wira.calculator.JUnit_Kalkulator;

public class JUnit_Kalkulator_Testing {
	/**
	 *
	 * @author Wira
	 */
	public static void main(String[] args) {
		JUnit_Kalkulator kalkulator = new JUnit_Kalkulator();
        System.out.println(" 10 * 2 = "+kalkulator.kali(10, 2)); //hasilnya seharusnya 20
        System.out.println(" 10 / 2 = "+kalkulator.bagi(10, 2)); //hasilnya seharusnya 5
        System.out.println(" 10 + 2 = "+kalkulator.tambah(10, 2)); //hasilnya seharusnya 12
        System.out.println(" 10 - 2 = "+kalkulator.kurang(10, 2)); //hasilnya seharusnya 8
	}

}
