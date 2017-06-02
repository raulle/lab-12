package it.polito.tdp.rivers.model;

public class TetsModel {

	public static void main(String[] args) {
		
		Model model=new Model();
		System.out.println(model.getFlussoMedio(new River(1,"Jokulsa Eystri River")));
		System.out.println(model.getFlussoMedio(new River(2,"Vatnsdalsa River")));
		System.out.println(model.getFlussoMedio(new River(3,"Fisher River near Dallas")));
		System.out.println(model.getFlussoMedio(new River(4,"Oldman Rivernear Brocket")));
		System.out.println(model.getFlussoMedio(new River(5,"Saugeen River near Port Elgin")));
		System.out.println(model.getFlussoMedio(new River(6,"Saugeen River")));
	}

}
