package primeiro;

import java.util.ArrayList;

public class Primeiro {

	public static void main(String[] args) {
		ArrayList<ClienteCeaPay> listadecliente = new ArrayList<ClienteCeaPay>();
		
		
		ClienteCeaPay cliente1 = new ClienteCeaPay();/*Criou um objeto ClienteCEaPay */ 
		ClienteCeaPay cliente2 = new ClienteCeaPay();
		ClienteCeaPay cliente3 = new ClienteCeaPay();
		ClienteCeaPay cliente4 = new ClienteCeaPay();
		ClienteCeaPay cliente5 = new ClienteCeaPay();
		
		cliente1.setCeapay(false);
		cliente1.setCpf("12522485022");
		cliente1.setNome("Luis");
		
		cliente2.setCeapay(true);
		cliente2.setCpf("13192533478");
		cliente2.setNome("Ana");
		
		cliente3.setCeapay(true);
		cliente3.setCpf("08905369222");
		cliente3.setNome("Maria");
		
		cliente4.setCeapay(false);
		cliente4.setCpf("03839025477");
		cliente4.setNome("Felipe");
		
		cliente5.setCeapay(false);
		cliente5.setCpf("13422967588");
		cliente5.setNome("Gustavo");
		
		listadecliente.add(cliente1);
		listadecliente.add(cliente2);
		listadecliente.add(cliente3);
		listadecliente.add(cliente4);
		listadecliente.add(cliente5);
		
		
		for (ClienteCeaPay cliente:listadecliente ) { // criei uma lista do tipo ClienteCeaPay
			if (cliente.isCeapay() == true)
			{ 
			  System.out.println("Esse cliente é Cea Pay");
			} else {
				
				System.out.println("Esse Cliente não é Cea Pay");
			}
		}
		
		
	}
}
