package it.polito.tdp.db;

import it.polito.tdp.rivers.model.River;

public class TestDAO {

	public static void main(String[] args) {
		RiversDAO dao = new RiversDAO();
		River r= new River(1,"Jokulsa Eystri River");
		System.out.println(dao.getMisureFiume(r));
	}

}
