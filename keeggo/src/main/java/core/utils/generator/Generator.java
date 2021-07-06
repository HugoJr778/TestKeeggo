package core.utils.generator;

import java.util.Random;

public class Generator {
	
	private static Random random = new Random();
	
	private Generator() {}
	
	public static String getPalavra(int tamanho) {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
		StringBuilder strb = new StringBuilder();
		int index = -1;
		for(int i = 0; i < tamanho; i++) {
		   index = random.nextInt(letras.length());
		   strb.append(letras.substring(index, index + 1));
		}
		return strb.toString();
	}
	
	public static String getNum(int limiteNum) {
		return Integer.toString(random.nextInt(limiteNum < 1 ? 100000 : limiteNum) + 2);
	}
}