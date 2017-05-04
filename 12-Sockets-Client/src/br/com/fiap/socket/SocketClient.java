package br.com.fiap.socket;

import java.awt.PageAttributes;
import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class SocketClient {
	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa("BANANA", 25);
		
		
		Socket socket = new Socket("127.0.0.1",9001);
		
		ObjectOutputStream objectOut = new ObjectOutputStream(socket.getOutputStream());
		
		objectOut.writeObject(p);
		
		System.out.println("Pessoa serializada!");
		socket.close();
		objectOut.close();
	}
}
