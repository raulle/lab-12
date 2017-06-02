package it.polito.tdp.rivers.model;

import java.time.LocalDate;
import java.util.List;

import it.polito.tdp.db.RiversDAO;

public class Model {
	
	private RiversDAO dao;
	private List<River> fiumi;
	
	public Model(){
		this.dao= new RiversDAO();
	}
	
	public List<River> getFiumi(){
		fiumi=dao.getFiumi();
		return fiumi;
	}
	
	public Statistics getMisureFiume(River r){
		List<Flow> f=dao.getMisureFiume(r);
		double avg=0.0;
		for(Flow ff : r.getMisure())
			avg+=ff.getFlusso();
		return new Statistics(f.size(), f.get(0).getData(), f.get(f.size()-1).getData(), avg/(f.size()-1) );
	}
	
	public LocalDate getUltimaData(River r){
		dao.getMisureFiume(r);
		return r.getMisure().get(r.getMisure().size()-1).getData();
	}
	
	public Integer getNumMis(River r){
		dao.getMisureFiume(r);
		return r.getMisure().size();
	}

	public Double getFlussoMedio(River r){
		dao.getMisureFiume(r);
		double avg=0.0;
		for(Flow f : r.getMisure())
			avg+=f.getFlusso();
		return avg/r.getMisure().size()-1;
	}
	

}
