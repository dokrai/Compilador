package asint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Reader input = new InputStreamReader(new FileInputStream("input.txt"));
	    AnalizadorSintactico asint = new AnalizadorSintactico(input);
	    asint.S();
	    System.out.println("ANALIS TERMINADO");
	}

}