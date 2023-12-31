package mms.member.ui;

import java.util.Scanner;

import mms.member.action.Action;
import mms.member.action.MemberAddAction;
import mms.member.action.MemberListAction;
import mms.member.action.MemberModifyAction;
import mms.member.action.MemberRemoveAction;
import mms.member.controller.MemberController;

public class MemberUI {

	public static void main(String[] args) {
		boolean isStop = false;
		MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);
		Action action = null;
		
		int num;
		do {
			System.out.println("=====회원관리 프로그램=====");
			System.out.println("1.회원등록");
			System.out.println("2.회원목록보기");
			System.out.println("3.회원정보수정");
			System.out.println("4.회원정보삭제");
			System.out.println("5.프로그램 종료");
			System.out.print("메뉴번호 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:
				action = new MemberModifyAction();
				break;
			case 4:
				action = new MemberRemoveAction();
				break;
			case 5:
				isStop = true;
				System.out.println("프로그램 종료");
				break;
			}
			
			if(action != null) {
				memberController.processrequest(action, sc);
				action = null;
			}
			
		}
		while (!isStop);
	}

}
