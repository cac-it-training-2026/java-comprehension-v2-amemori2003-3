package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member main01 = new Member();

		main01.name = "Miura Manabu";
		main01.age = 24;
		main01.rank = 1;

		main01.showMember();

		Member main02 = new Member();

		main02.name = "Sato Kensuke";
		main02.age = 36;
		main02.rank = 2;

		main02.showMember();

	}

}
