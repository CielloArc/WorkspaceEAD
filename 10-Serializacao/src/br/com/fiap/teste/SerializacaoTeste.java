package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Pessoa;

public class SerializacaoTeste {
	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa("BATMAN", 33);
		
		FileOutputStream fileOut = new FileOutputStream("Arquivos-do-Batcomputador");
		
		ObjectOutputStream objectStream = new ObjectOutputStream(fileOut);
		
		objectStream.writeObject(pessoa);
		
		objectStream.close();
		fileOut.close();
		
		System.out.println("Objeto serializado!");
	}
}
