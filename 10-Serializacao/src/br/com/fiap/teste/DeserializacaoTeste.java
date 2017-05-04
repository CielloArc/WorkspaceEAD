package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Pessoa;

public class DeserializacaoTeste {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInput = new FileInputStream("Arquivos-do-Batcomputador");
		
		ObjectInputStream objInput = new ObjectInputStream(fileInput);		
				
		Pessoa p = (Pessoa) objInput.readObject();
		
		objInput.close();
		fileInput.close();
		
		System.out.println(p.getNome() + "\t" + p.getIdade());
		
		
	}
}
