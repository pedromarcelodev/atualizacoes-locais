package br.edu.pedromarcelo.criptografia;

public class BlueKryptos {
	
	private static final int PRIME = 61;
	
	private static String geraZeros(String b){
		for(; b.length() % 8 != 0; b = "0"+b);
		
		return b;
	}
	
	private static int offset(char c){
		int off = c;
		
		return off - PRIME;
	}
}
