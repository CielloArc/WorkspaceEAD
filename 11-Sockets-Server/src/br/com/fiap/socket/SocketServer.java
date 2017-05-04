package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

//Ler o objeto pela rede (socket)
public class SocketServer {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(9001);
		System.out.println("Aguardando...");
		//Aguardando a conexao
		Socket socket = server.accept();
		
		ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
		
		Pessoa p = (Pessoa) objectInput.readObject();
		
		System.out.println(p.getNome() + "\t" + p.getIdade());
		
		objectInput.close();
	}
}
