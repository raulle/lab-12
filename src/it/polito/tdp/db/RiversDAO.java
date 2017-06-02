package it.polito.tdp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.rivers.model.Flow;
import it.polito.tdp.rivers.model.River;

public class RiversDAO {
	
	public List<River> getFiumi() {
		List<River> result = new ArrayList<River>();
		Connection conn = ConnectDB.getInstance().getConnection();
		String sql = "SELECT * FROM river";

		try {
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				River river = new River(rs.getInt("id"), rs.getString("name"));
				result.add(river);
				//System.out.println(river.toString());
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Error in database query", e);
		}

		return result;
	}

	public List<Flow> getMisureFiume(River r) {
		//List<Flow> result = new ArrayList<Flow>();
		Connection conn = ConnectDB.getInstance().getConnection();
		String sql = "select id,day,flow from flow where river=? order by day";

		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, r.getId());
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Flow f = new Flow(rs.getInt("id"),rs.getDate("day").toLocalDate(),rs.getDouble("flow"));
				r.addFlow(f);
				//System.out.println(r.toString()+"\n"+f.toString());
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Error in database query", e);
		}

		return r.getMisure();
	}
	
	

}
