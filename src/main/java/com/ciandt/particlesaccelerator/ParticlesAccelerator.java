package com.ciandt.particlesaccelerator;

public class ParticlesAccelerator {
	
	private static int fator;
	
	private static long atomosProximaRegiao;
	
	private static long restamNaRegiao;
		
	private ParticlesAccelerator() {

	}

	public static String getDistribution(long atomos, int tamanho, int regioes) {
		String regioesStr = "";
		tamanho = tamanho < 1 ? 1 : tamanho;
		tamanho = tamanho > 100 ? 100 : tamanho;
		regioes = regioes < 1 ? 1 : regioes;
		regioes = regioes > 100 ? 100 : regioes;
		atomos = atomos < 1 ? 1 : atomos;
		atomos = atomos > 1_000_000_000 ? 1_000_000_000 : atomos;
		
		atomosProximaRegiao = atomos;
		
		for(int regiaoAtual = 0; regiaoAtual < regioes; regiaoAtual++) {
			processaRegiao(tamanho, atomosProximaRegiao);
			regioesStr += restamNaRegiao + " ";
		}
		
		return regioesStr.trim();
	}

	private static void processaRegiao(final int tamanho, final long atomosEntrada) {		
		fator = tamanho + 1;
		atomosProximaRegiao = atomosEntrada/fator;
		restamNaRegiao = atomosEntrada%fator;
	}

}
