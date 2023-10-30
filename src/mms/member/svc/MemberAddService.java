package mms.member.svc;

import java.sql.Connection;

import mms.member.dao.MemberDAO;
import mms.member.vo.Member;

public class MemberAddService {
	Connection con;
	
	MemberDAO dao = new MemberDAO(con);
	
	public boolean addMember(Member newMember) throws Exception{
		boolean result;
		if(dao.insertNewMember(newMember) == 0) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
