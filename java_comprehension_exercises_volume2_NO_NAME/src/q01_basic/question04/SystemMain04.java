package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		Member main01 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member main02 = new Member(2, "aaaAAA", "Satou Kensuke", 43, 1);

		members[0] = main01;
		members[1] = main02;

		MemberManager.showAllMembers(members);

	}

}
