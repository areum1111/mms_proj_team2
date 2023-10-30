package mms.member.util;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.vo.Member;

public class ConsolUtil {
	public Member getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주소 : ");
		String addr = sc.next();
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("이메일 : ");
		String mail = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		Member m = new Member(0, name, addr, nation, mail, age);
		
		return m;
	}
	
	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 성공");
	}
	
	public void printAddMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 실패");
	}
	
	public void printMemberList(ArrayList<Member> memberList) {
		
		for(int i = 0; i < memberList.size(); i++) {
				System.out.println(memberList.get(i));
		}
	}
	
	public String getName(String msgKind, Scanner sc) {
		System.out.printf("%s 회원이름을 입력하세요\n", msgKind);
		System.out.print("회원이름 : ");
		String name = sc.next();
		
		return name;
	}
	
	public Member getUpdateMember(Scanner sc, Member oldMember) {
		System.out.println("수정할 회원 정보를 입력하세요");
		System.out.print("이전 국가 : " + oldMember.getNation() + " 수정할 국가 : ");
		String nation = sc.next();
		System.out.print("이전 주소 : " + oldMember.getAddr() + " 수정할 주소 : ");
		String addr = sc.next();
		System.out.print("이전 이메일 : " + oldMember.getEmail() + " 수정할 이메일 : ");
		String mail = sc.next();
		System.out.print("이전 나이 : " + oldMember.getAge() + " 수정할 나이 : ");
		int age = sc.nextInt();
		
		Member m = new Member(oldMember.getId(), oldMember.getName(), addr, nation, mail, age);
		
		return m;
	}
	
	public void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 성공");
	}
	
	public void printModifyFailMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 실패");
	}
	
	public void printremoveSuccessMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 성공");
	}
	
	public void printremoveFailMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 실패");
	}
}
