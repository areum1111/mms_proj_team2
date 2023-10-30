package mms.member.action;

import java.util.Scanner;

import mms.member.svc.MemberAddService;
import mms.member.util.ConsolUtil;
import mms.member.vo.Member;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsolUtil u = new ConsolUtil();
		Member m = new Member();
		m = u.getNewMember(sc);
		
		MemberAddService add = new MemberAddService();
		
		if(add.addMember(m) == true) {
			u.printAddSuccessMessage(m);
		} else {
			u.printAddMessage(m);
		}
	}

}
