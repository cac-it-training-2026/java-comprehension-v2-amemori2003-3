package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member main01 = new Member();

		main01.setName("Miura Manabu");
		main01.setAge(30);
		main01.setRank(1);

		main01.showMember();
		main01.rankUp();

	}
}
