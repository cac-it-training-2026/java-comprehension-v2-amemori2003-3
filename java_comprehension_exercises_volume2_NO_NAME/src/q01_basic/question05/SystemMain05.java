package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember main01 = new NonMember("Sato Kensuke ");
		members[0] = main01;

		Member main02 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		members[1] = main02;

		MemberManager.showAllMembers(members);
		main01.buyItem();
		main02.buyItem();

	}

}
